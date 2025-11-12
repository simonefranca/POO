public class Produto extends Bem{
    private int quantidadeEmEstoque;
    private double valorUnitario;

    public Produto(String descricao, int quantidadeEmEstoque, double valorUnitario) {
        super(descricao);
        this.quantidadeEmEstoque = quantidadeEmEstoque;
        this.valorUnitario = valorUnitario;
    }

    @Override
    public double calculaValor() {
        return quantidadeEmEstoque * valorUnitario;
    }
}
