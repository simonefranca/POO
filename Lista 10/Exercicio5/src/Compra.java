public class Compra {
    private String descricao;
    private int quantidade;
    private double valorUnitario;

    // Construtor
    public Compra(String descricao, int quantidade, double valorUnitario) {
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.valorUnitario = valorUnitario;
    }

    // Método para calcular o valor total da compra
    public double calculaValorTotal() {
        return quantidade * valorUnitario;
    }

    // Método toString para exibir informações da compra
    @Override
    public String toString() {
        return "Descrição: " + descricao + ", Quantidade: " + quantidade +
               ", Valor Unitário: " + valorUnitario + ", Valor Total: " + calculaValorTotal();
    }
}
