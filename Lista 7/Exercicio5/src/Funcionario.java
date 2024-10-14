import java.text.DecimalFormat;

public class Funcionario {
    private String nome;
    private double salarioBase;
    private double totalVendas;
    private double taxaComissao;

    // Construtor para inicializar os campos
    public Funcionario(String nome, double salarioBase, double totalVendas, double taxaComissao) {
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.totalVendas = totalVendas;
        this.taxaComissao = taxaComissao;
    }

    // Método que calcula e imprime o salário total, formatado com duas casas decimais
    public void imprimeSalarioTotal() {
        double salarioTotal = salarioBase + (totalVendas * taxaComissao);
        // Formata o salário para exibir com duas casas decimais
        DecimalFormat df = new DecimalFormat("#,##0.00");
        System.out.println("O salário total de " + nome + " é: R$ " + df.format(salarioTotal));
    }
}
