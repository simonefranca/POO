import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Criação da loja
        Loja loja = new Loja();

        // Criando alguns produtos
        Produto p1 = new Produto("Camiseta", 29.90, 50);
        Produto p2 = new Produto("Calça Jeans", 99.90, 30);
        Produto p3 = new Produto("Tênis", 150.00, 20);

        // Adicionando produtos à loja
        loja.adicionarProduto(p1);
        loja.adicionarProduto(p2);
        loja.adicionarProduto(p3);

        // Exibindo todos os produtos
        System.out.println("Produtos na loja:");
        loja.listarProdutos();

        // Atualizando o estoque de um produto
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o nome do produto que deseja atualizar o estoque: ");
        String nomeProduto = teclado.nextLine();
        System.out.print("Digite a quantidade a ser adicionada no estoque: ");
        int quantidade = teclado.nextInt();

        loja.atualizarEstoqueProduto(nomeProduto, quantidade);

        // Exibindo os produtos novamente após a atualização
        System.out.println("\nProdutos na loja após atualização de estoque:");
        loja.listarProdutos();

        teclado.close();
    }
}
