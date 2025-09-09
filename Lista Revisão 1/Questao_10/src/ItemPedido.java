public class ItemPedido {
    private Produto produto;
    private int quantidade;

    public ItemPedido(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public double calcularSubtotal() {
        return produto.getValor() * quantidade;
    }

    public void exibirItemPedido() {
        produto.exibirProduto();
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Subtotal: R$" + calcularSubtotal());
    }
}
