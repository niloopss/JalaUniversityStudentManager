import java.util.ArrayList;
import java.util.List;

class Aluno {
    private String nome;
    private double nota;
    private final List<String> cursos;

    public Aluno(String nome) {
        this.nome = nome;
        this.nota = 0.0;
        this.cursos = new ArrayList<>();
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

    public List<String> getCursos() {
        return cursos;
    }

    public void adicionarCurso(String curso) {
        cursos.add(curso);
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Nota: " + nota + ", Cursos: " + String.join(", ", cursos);
    }
}