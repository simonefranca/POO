import java.util.ArrayList;
import java.util.List;

public class Loja {
    private List<Produto> produtos;

    // Construtor
    public Loja() {
        produtos = new ArrayList<>();
    }

    // Método para adicionar produto à loja
    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    // Método para atualizar a quantidade de estoque de um produto
    public void atualizarEstoqueProduto(String nomeProduto, int quantidade) {
        for (Produto produto : produtos) {
            if (produto.getNome().equalsIgnoreCase(nomeProduto)) {
                produto.atualizarEstoque(quantidade);
                System.out.println("Quantidade do produto " + nomeProduto + " atualizada!");
                return;
            }
        }
        System.out.println("Produto não encontrado!");
    }

    // Método para listar todos os produtos da loja
    public void listarProdutos() {
        if (produtos.isEmpty()) {
            System.out.println("Não há produtos na loja.");
        } else {
            for (Produto produto : produtos) {
                produto.exibirProduto();
            }
        }
    }
}
