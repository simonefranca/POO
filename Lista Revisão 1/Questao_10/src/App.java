import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
         Scanner teclado = new Scanner(System.in);

        // Criar alguns produtos
        Produto produto1 = new Produto("P001", 10.0, "Produto 1");
        Produto produto2 = new Produto("P002", 20.0, "Produto 2");

        // Exibir produtos
        System.out.println("Produtos disponíveis:");
        produto1.exibirProduto();
        System.out.println();
        produto2.exibirProduto();
        System.out.println();

        // Criar um pedido
        Pedido pedido = new Pedido();

        // Adicionar um item ao pedido
        System.out.println("Digite o código do produto para adicionar ao pedido:");
        String codigo = teclado.nextLine();
        Produto produtoSelecionado = null;
        if (codigo.equals("P001")) {
            produtoSelecionado = produto1;
        } else if (codigo.equals("P002")) {
            produtoSelecionado = produto2;
        } else {
            System.out.println("Produto não encontrado.");
            return;
        }

        System.out.println("Digite a quantidade:");
        int quantidade = teclado.nextInt();
        teclado.nextLine();  // Limpar o buffer

        ItemPedido itemPedido = new ItemPedido(produtoSelecionado, quantidade);
        pedido.adicionarItem(itemPedido);

        // Exibir o pedido
        System.out.println("\nDetalhes do Pedido:");
        pedido.exibirPedido();

        teclado.close();
    }
}
