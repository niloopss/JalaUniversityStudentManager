import java.util.List;
import java.util.Scanner;

/**
 * Classe principal do sistema JalaUniversityStudentManager.
 * Contém o método main que inicia a execução do programa e oferece um menu interativo para gerenciar alunos e cursos.
 * @author Nivea Lins
 */
public class Main {
    /**
     * Método principal do programa.
     * Exibe um menu com opções para adicionar alunos, atribuir cursos e notas, listar alunos e sair do programa.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Universidade universidade = new Universidade();

        int opcao;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Adicionar aluno");
            System.out.println("2. Atribuir curso a aluno");
            System.out.println("3. Atribuir nota a aluno");
            System.out.println("4. Listar alunos por curso");
            System.out.println("5. Listar todos os alunos");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    /* Código para adicionar aluno */
                    System.out.print("Nome do aluno: ");
                    scanner.nextLine();
                    String nome = scanner.nextLine();
                    System.out.print("Nota inicial: ");
                    double nota = scanner.nextDouble();
                    universidade.addAluno(new Aluno(nome, nota));
                    break;
                case 2:
                    /* Código para atribuir curso a aluno */
                    System.out.print("Nome do aluno: ");
                    scanner.nextLine();
                    nome = scanner.nextLine();
                    System.out.print("Curso a ser atribuído: ");
                    String curso = scanner.nextLine();
                    for (Aluno aluno : universidade.alunos) {
                        if (aluno.getNome().equals(nome)) {
                            aluno.addCurso(curso);
                            break;
                        }
                    }
                    break;
                case 3:
                    /* Código para atribuir nota a aluno */
                    System.out.print("Nome do aluno: ");
                    scanner.nextLine();
                    nome = scanner.nextLine();
                    System.out.print("Nova nota: ");
                    nota = scanner.nextDouble();
                    for (Aluno aluno : universidade.alunos) {
                        if (aluno.getNome().equals(nome)) {
                            aluno.setNota(nota);
                            break;
                        }
                    }
                    break;
                case 4:
                    /* Código para listar alunos por curso */
                    System.out.print("Nome do curso: ");
                    scanner.nextLine();
                    curso = scanner.nextLine();
                    List<String> alunosNoCurso = universidade.filter(curso);
                    if (alunosNoCurso.isEmpty()) {
                        System.out.println("Nenhum aluno encontrado no curso " + curso);
                    } else {
                        System.out.println("Alunos no curso " + curso + ": " + String.join(", ", alunosNoCurso));
                    }
                    break;
                case 5:
                    /* Código para listar todos os alunos */
                    universidade.listarAlunos();
                    break;
                case 0:
                    /* Código para sair do menu */
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }
}