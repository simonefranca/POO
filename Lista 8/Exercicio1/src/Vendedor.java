public class Vendedor extends Funcionario {
    private double totalVendas;

    // Construtor
    public Vendedor(String nome, double salario, double totalVendas) {
        super(nome, salario);
        this.totalVendas = totalVendas;
    }

    // Sobrescrita do método calcularBonus para Vendedor
    @Override
    public double calcularBonus() {
        return salario * 0.05 + totalVendas * 0.02;
    }

    // Getter para total de vendas
    public double getTotalVendas() {
        return totalVendas;
    }
}