public class Pedido {
    private ItemPedido itemPedido;
    private double valorTotal;

    public Pedido() {
        this.itemPedido = null;
        this.valorTotal = 0.0;
    }

    public void adicionarItem(ItemPedido itemPedido) {
        this.itemPedido = itemPedido;
        this.valorTotal = itemPedido.calcularSubtotal();
    }

    public void exibirPedido() {
        if (itemPedido != null) {
            System.out.println("Detalhes do Pedido:");
            itemPedido.exibirItemPedido();
            System.out.println("Valor Total: R$" + valorTotal);
        } else {
            System.out.println("Nenhum item no pedido.");
        }
    }
}
