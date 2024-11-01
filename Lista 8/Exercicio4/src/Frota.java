import java.util.ArrayList;
import java.util.List;

public class Frota {
    private List<Veiculo> veiculos;

    // Construtor
    public Frota() {
        this.veiculos = new ArrayList<>();
    }

    // Método para adicionar veículos à frota
    public void adicionarVeiculo(Veiculo veiculo) {
        veiculos.add(veiculo);
    }

    // Método para exibir detalhes de todos os veículos da frota
    public void exibirFrota() {
        System.out.println("Detalhes da Frota:");
        for (Veiculo veiculo : veiculos) {
            veiculo.exibirDetalhes();
            System.out.println();
        }
    }
}
