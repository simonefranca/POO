import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        Consulta consulta = null; // Variável para armazenar a consulta

        int opcao;
        do {
            System.out.println("\nMenu:");
            System.out.println("1 - Criar Consulta");
            System.out.println("2 - Alterar Dados Pessoais");
            System.out.println("3 - Alterar Data");
            System.out.println("4 - Alterar Hora");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = teclado.nextInt();
            teclado.nextLine(); // Limpar o buffer do teclado

            switch (opcao) {
                case 1:
                    // Criar Consulta
                    System.out.print("Digite o nome: ");
                    String nome = teclado.nextLine();
                    System.out.print("Digite o telefone: ");
                    String telefone = teclado.nextLine();
                    System.out.print("Digite o e-mail: ");
                    String email = teclado.nextLine();
                    System.out.print("Digite a data (dd/mm/yyyy): ");
                    String data = teclado.nextLine();
                    System.out.print("Digite a hora (hh:mm): ");
                    String hora = teclado.nextLine();

                    consulta = new Consulta(nome, telefone, email, data, hora);
                    consulta.exibirConsulta();
                    break;

                case 2:
                    if (consulta != null) {
                        // Alterar Dados Pessoais
                        System.out.print("Digite o novo nome: ");
                        consulta.setNome(teclado.nextLine());
                        System.out.print("Digite o novo telefone: ");
                        consulta.setTelefone(teclado.nextLine());
                        System.out.print("Digite o novo e-mail: ");
                        consulta.setEmail(teclado.nextLine());
                        consulta.exibirConsulta();
                    } else {
                        System.out.println("Nenhuma consulta criada.");
                    }
                    break;

                case 3:
                    if (consulta != null) {
                        // Alterar Data
                        System.out.print("Digite a nova data (dd/mm/yyyy): ");
                        consulta.setData(teclado.nextLine());
                        consulta.exibirConsulta();
                    } else {
                        System.out.println("Nenhuma consulta criada.");
                    }
                    break;

                case 4:
                    if (consulta != null) {
                        // Alterar Hora
                        System.out.print("Digite a nova hora (hh:mm): ");
                        consulta.setHora(teclado.nextLine());
                        consulta.exibirConsulta();
                    } else {
                        System.out.println("Nenhuma consulta criada.");
                    }
                    break;

                case 5:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 5);

        teclado.close();
    }
}
