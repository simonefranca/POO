import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        // Criação dos dois terminais
        TerminalTicket terminal1 = new TerminalTicket("Metrô da Lapa", 5.5);
        TerminalTicket terminal2 = new TerminalTicket("Ônibus Penha", 4.85);

        // Exibição dos nomes dos terminais
        System.out.println("Terminais disponíveis:");
        System.out.println("1. " + terminal1.getNomeTerminal());
        System.out.println("2. " + terminal2.getNomeTerminal());

        //Pedir para o usuário escolher um terminal
        System.out.print("Escolha um terminal (1 ou 2): ");
        int escolha = teclado.nextInt();

        TerminalTicket terminalEscolhido;

        if (escolha == 1) {
            terminalEscolhido = terminal1;
        } else if (escolha == 2) {
            terminalEscolhido = terminal2;
        } else {
            System.out.println("Opção inválida.");
            teclado.close();
            //Finaliza o programa
            return;
        }

        // Inserção de dinheiro pelo usuário
        System.out.print("Insira o valor do dinheiro: R$ ");
        double valorInserido = teclado.nextDouble();

        // Verificação do valor inserido e geração do ticket
        terminalEscolhido.inserirDinheiro(valorInserido);

        teclado.close();
    }
}
