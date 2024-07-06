import java.util.List;
import java.util.Scanner;


public class Main {
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
                    System.out.print("Nome do aluno: ");
                    scanner.nextLine(); // Consumir a quebra de linha
                    String nome = scanner.nextLine();
                    System.out.print("Nota inicial: ");
                    double nota = scanner.nextDouble();
                    universidade.addAluno(new Aluno(nome, nota));
                    break;
                case 2:
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
                    universidade.listarAlunos();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }
}