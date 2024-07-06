import java.util.Vector;
import java.util.List;

class Aluno {
    private String nome;
    private double nota;
    private Vector<String> cursos = new Vector<>();

    public Aluno(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public void addCurso(String curso) {
        cursos.add(curso);
    }

    public List<String> getCursos() {
        return cursos;
    }
}