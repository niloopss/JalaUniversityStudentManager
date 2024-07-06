import java.util.List;
import java.util.Vector;


class Universidade {
    Vector<Aluno> alunos = new Vector<>();

    public void addAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public List<String> filter(String curso) {
        List<String> nomes = new Vector<>();
        for (Aluno aluno : alunos) {
            if (aluno.getCursos().contains(curso)) {
                nomes.add(aluno.getNome());
            }
        }
        return nomes;
    }

    public void listarAlunos() {
        for (Aluno aluno : alunos) {
            System.out.println("Nome: " + aluno.getNome() +
                    ", Nota: " + aluno.getNota() +
                    ", Cursos: " + String.join(", ", aluno.getCursos()));
        }
    }
}
