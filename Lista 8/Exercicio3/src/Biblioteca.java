import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<ItemBiblioteca> itens;

    // Construtor
    public Biblioteca() {
        this.itens = new ArrayList<>();
    }

    // Método para adicionar itens à biblioteca
    public void adicionarItem(ItemBiblioteca item) {
        itens.add(item);
    }

    // Método para exibir detalhes de todos os itens
    public void exibirItens() {
        System.out.println("Itens da Biblioteca:");
        for (ItemBiblioteca item : itens) { //for aprimorado
            item.exibirDetalhes();
            System.out.println();
        }
    }
}
