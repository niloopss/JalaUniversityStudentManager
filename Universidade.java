import java.util.ArrayList;
import java.util.List;

class Universidade {
    private final List<Aluno> alunos;

    public Universidade() {
        alunos = new ArrayList<>();
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    // Método getAluno corrigido
    public Aluno getAluno(String nome) {
        for (Aluno aluno : alunos) {
            if (aluno.getNome().equalsIgnoreCase(nome)) { // Ignora maiúsculas/minúsculas
                return aluno;
            }
        }
        return null; // Retorna null se o aluno não for encontrado
    }

    // Método listarAlunosPorCurso corrigido
    public void listarAlunosPorCurso(String curso) {
        List<Aluno> alunosNoCurso = getAlunosPorCurso(curso);
        if (alunosNoCurso.isEmpty()) {
            System.out.println("Nenhum aluno encontrado no curso " + curso);
        } else {
            System.out.println("Alunos matriculados em " + curso + ":");
            for (Aluno aluno : alunosNoCurso) {
                System.out.println(aluno);
            }
        }
    }

    private List<Aluno> getAlunosPorCurso(String curso) {
        List<Aluno> alunosNoCurso = new ArrayList<>();
        for (Aluno aluno : alunos) {
            if (aluno.getCursos().contains(curso)) {
                alunosNoCurso.add(aluno);
            }
        }
        return alunosNoCurso;
    }
    public void listarTodosAlunos() {
        if (alunos.isEmpty()) {
            System.out.println("Nenhum aluno cadastrado.");
            return;
        }
        System.out.println("Lista de todos os alunos:");
        for (Aluno aluno : alunos) {
            System.out.println(aluno);
        }
    }
}