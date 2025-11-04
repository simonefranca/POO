public class App {
    public static void main(String[] args) throws Exception {
        // Cria um obejto/instância de ContaCorrente
        ContaCorrente contaCorrente = new ContaCorrente(12323, 6500.0, 7000.0);
        System.out.println("Conta Corrente - Saldo inicial: R$ " + contaCorrente.getSaldo());
        contaCorrente.depositar(400.0);
        contaCorrente.sacar(300.0);
        System.out.println("Saldo após operações: R$ " + contaCorrente.getSaldo());

        // Cria um obejto/instância de ContaPoupanca
        ContaPoupanca contaPoupanca = new ContaPoupanca(23243, 1500.0, 0.01);
        System.out.println("\nConta Poupança - Saldo inicial: R$ " + contaPoupanca.getSaldo());
        contaPoupanca.depositar(800.0);
        contaPoupanca.aplicarRendimento();
        System.out.println("Saldo após operações e rendimento: R$ " + contaPoupanca.getSaldo());
    }
}
