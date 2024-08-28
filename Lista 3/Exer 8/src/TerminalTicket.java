public class TerminalTicket {
    private double valorTicket;
    private String nomeTerminal;

    // Construtor da classe
    public TerminalTicket(String nomeTerminal, double valorTicket) {
        this.nomeTerminal = nomeTerminal;
        this.valorTicket = valorTicket;
    }

    // Método para inserir dinheiro e verificar se o ticket pode ser gerado
    public void inserirDinheiro(double valorInserido) {
        if (valorInserido < valorTicket) {
            System.out.println("Ticket não gerado. Valor inserido insuficiente.");
        } else {
            double troco = valorInserido - valorTicket;
            System.out.println("Ticket gerado com sucesso!");
            System.out.println("Nome do Ticket: " + nomeTerminal);
            System.out.println("Valor do Ticket: R$ " + valorTicket);
            System.out.println("Troco: R$ " + troco);
        }
    }

    // Método para obter o nome do terminal
    public String getNomeTerminal() {
        return nomeTerminal;
    }
}
