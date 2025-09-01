public class Conta {
    private Proprietario proprietario;
    private double saldo;

    // Construtor
    public Conta(Proprietario proprietario, double saldo) {
        this.proprietario = proprietario;
        this.saldo = saldo;
    }

    // Getters e Setters
    public Proprietario getProprietario() {
        return proprietario;
    }

    public void setProprietario(Proprietario proprietario) {
        this.proprietario = proprietario;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // Métodos de depósito e saque
    public String depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            return "Depósito de R$" + valor + " realizado com sucesso.";
        } else {
            return "Valor de depósito inválido.";
        }
    }

    public String sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            return "Saque de R$" + valor + " realizado com sucesso.";
        } else {
            return "Saldo insuficiente ou valor inválido.";
        }
    }

    // Método extrato
    public String extrato() {
        return "Conta{\n" +
               "Proprietário=" + proprietario + "\n" +
               "Saldo=" + saldo + "\n" +
               '}';
    }
}
