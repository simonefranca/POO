public class Vendedor {
    private String nome;
    private double saldo;

    public Vendedor(String nome, double saldoInicial) {
        this.nome = nome;
        this.saldo = saldoInicial;
    }

    public void adicionarSaldo(double novoValor) {
        this.saldo += novoValor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
