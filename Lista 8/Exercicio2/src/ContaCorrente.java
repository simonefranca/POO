public class ContaCorrente extends Conta {
    private double limite;

    // Construtor
    public ContaCorrente(int numero, double saldoInicial, double limite) {
        super(numero, saldoInicial);
        this.limite = limite;
    }

    // Sobrescrita do método sacar para permitir saques até o limite
    @Override
    public boolean sacar(double valor) {
        if (valor > 0 && valor <= (saldo + limite)) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
            return true;
        } else {
            System.out.println("Saldo e limite insuficientes ou valor inválido.");
            return false;
        }
    }

    // Getter para o limite
    public double getLimite() {
        return limite;
    }
}