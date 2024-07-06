import java.util.Vector;
import java.util.List;

/**
 * Classe que representa um aluno, contendo informações como nome, nota e cursos matriculados.
 * @author Nivea Lins
 */
class Aluno {
    /**
     * Nome do aluno.
     */
    private String nome;
    /**
     * Nota do aluno.
     */
    private double nota;
    /**
     * Lista de cursos em que o aluno está matriculado.
     */
    private Vector<String> cursos = new Vector<>();

    /**
     * Construtor da classe Aluno.
     *
     * @param nome O nome do aluno.
     * @param nota A nota inicial do aluno.
     */
    public Aluno(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
    }

    /**
     * Retorna o nome do aluno.
     *
     * @return O nome do aluno.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o nome do aluno.
     *
     * @param nome O novo nome do aluno.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Retorna a nota do aluno.
     *
     * @return A nota do aluno.
     */
    public double getNota() {
        return nota;
    }

    /**
     * Define a nota do aluno.
     *
     * @param nota A nova nota do aluno.
     */
    public void setNota(double nota) {
        this.nota = nota;
    }

    /**
     * Adiciona um curso à lista de cursos do aluno.
     *
     * @param curso O nome do curso a ser adicionado.
     */
    public void addCurso(String curso) {
        cursos.add(curso);
    }

    /**
     * Retorna a lista de cursos em que o aluno está matriculado.
     *
     * @return A lista de cursos do aluno.
     */
    public List<String> getCursos() {
        return cursos;
    }
}