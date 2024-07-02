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
            scanner.nextLine(); // Limpar o buffer do scanner

            switch (opcao) {
                case 1:
                    System.out.print("Nome do aluno: ");
                    String nome = scanner.nextLine();
                    universidade.adicionarAluno(new Aluno(nome));
                    break;
                case 2:
                    System.out.print("Nome do aluno: ");
                    nome = scanner.nextLine();
                    System.out.print("Nome do curso: ");
                    String curso = scanner.nextLine();
                    universidade.getAluno(nome).adicionarCurso(curso);
                    break;
                case 3:
                    System.out.print("Nome do aluno: ");
                    nome = scanner.nextLine();
                    System.out.print("Nota: ");
                    double nota = scanner.nextDouble();
                    scanner.nextLine(); // Limpar o buffer
                    universidade.getAluno(nome).setNota(nota);
                    break;
                case 4:
                    System.out.print("Nome do curso: ");
                    curso = scanner.nextLine();
                    universidade.listarAlunosPorCurso(curso);
                    break;
                case 5:
                    universidade.listarTodosAlunos();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        scanner.close();
    }
}