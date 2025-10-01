public class Funcionario {
    private String nome;
    private double salarioBase;
    private double totalVendas;
    private double taxaComissao;

    // Construtor
    public Funcionario(String nome, double salarioBase, double totalVendas, double taxaComissao) {
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.totalVendas = totalVendas;
        this.taxaComissao = taxaComissao;
    }

    // Método que calcula o salário total
    public void imprimeSalarioTotal() {
        double salarioTotal = salarioBase + (totalVendas * taxaComissao);
        System.out.printf("Funcionário: %s\nSalário Total: %.2f\n", nome, salarioTotal);
    }
}
