import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        Conta conta = null;

        while (true) {
            System.out.println("\n=== Menu ===");
            System.out.println("1. Criar conta");
            System.out.println("2. Sacar");
            System.out.println("3. Depositar");
            System.out.println("4. Extrato");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha

            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("CPF: ");
                    String cpf = scanner.nextLine();
                    System.out.print("Endereço: ");
                    String endereco = scanner.nextLine();
                    System.out.print("eMail: ");
                    String eMail = scanner.nextLine();
                    
                    Proprietario proprietario = new Proprietario(nome, cpf, endereco, eMail);
                    
                    System.out.print("Saldo inicial: ");
                    double saldoInicial = scanner.nextDouble();
                    
                    conta = new Conta(proprietario, saldoInicial);
                    System.out.println("Conta criada com sucesso!");
                    break;

                case 2:
                    if (conta != null) {
                        System.out.print("Valor a sacar: ");
                        double valorSaque = scanner.nextDouble();
                        conta.sacar(valorSaque);
                    } else {
                        System.out.println("Nenhuma conta criada.");
                    }
                    break;

                case 3:
                    if (conta != null) {
                        System.out.print("Valor a depositar: ");
                        double valorDeposito = scanner.nextDouble();
                        conta.depositar(valorDeposito);
                    } else {
                        System.out.println("Nenhuma conta criada.");
                    }
                    break;

                case 4:
                    if (conta != null) {
                        System.out.println(conta.extrato());
                    } else {
                        System.out.println("Nenhuma conta criada.");
                    }
                    break;

                case 5:
                    System.out.println("Saindo...");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}

