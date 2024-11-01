public class ContaPoupanca extends Conta {
    private double taxaRendimento;

    // Construtor
    public ContaPoupanca(int numero, double saldoInicial, double taxaRendimento) {
        super(numero, saldoInicial);
        this.taxaRendimento = taxaRendimento;
    }

    // Método para aplicar o rendimento
    public void aplicarRendimento() {
        saldo += saldo * taxaRendimento;
        System.out.println("Rendimento de " + (taxaRendimento * 100) + "% aplicado. Novo saldo: R$ " + saldo);
    }

    // Getter para a taxa de rendimento
    public double getTaxaRendimento() {
        return taxaRendimento;
    }
}