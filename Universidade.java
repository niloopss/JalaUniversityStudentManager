import java.util.List;
import java.util.Vector;

/**
 * Classe que representa uma universidade e gerencia uma lista de alunos.
 * @author Nivea Lins
 */
class Universidade {
    /**
     * Vetor que armazena os alunos da universidade.
     */
    Vector<Aluno> alunos = new Vector<>();
    /**
     * Adiciona um novo aluno à universidade.
     *
     * @param aluno O objeto Aluno a ser adicionado.
     */
    public void addAluno(Aluno aluno) {
        alunos.add(aluno);
    }
    /**
     * Filtra os alunos matriculados em um determinado curso.
     *
     * @param curso O nome do curso a ser filtrado.
     * @return Uma lista com os nomes dos alunos matriculados no curso.
     */
    public List<String> filter(String curso) {
        List<String> nomes = new Vector<>();
        for (Aluno aluno : alunos) {
            if (aluno.getCursos().contains(curso)) {
                nomes.add(aluno.getNome());
            }
        }
        return nomes;
    }
    /**
     * Lista todos os alunos da universidade, exibindo seus nomes, notas e cursos.
     */
    public void listarAlunos() {
        for (Aluno aluno : alunos) {
            System.out.println("Nome: " + aluno.getNome() +
                    ", Nota: " + aluno.getNota() +
                    ", Cursos: " + String.join(", ", aluno.getCursos()));
        }
    }
}
