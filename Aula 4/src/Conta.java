public class Conta {
    public static boolean permitirMovimentacao = true;
    private String nome;
    private double saldo;
    
    public Conta(String nome, double saldo){
        this.nome = nome;
        this.saldo = saldo;
    }

    public void sacar (double valor){
        if (permitirMovimentacao) {
            this.saldo = saldo-valor;
        }else{
            System.out.println("Operação de saque negada!");
        }
    }

    public void depositar(double valor){
        if (permitirMovimentacao) {
            this.saldo = saldo+valor;
        }else{
            System.out.println("Operação de depósito negada!");
        }
    }
}
