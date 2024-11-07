import java.util.ArrayList;
import java.util.Comparator;

public class App {
    public static void main(String[] args) throws Exception {
        // Cria um ArrayList de Compras
        ArrayList<Compra> compras = new ArrayList<>();

        // Adiciona ao menos 5 compras no ArrayList
        compras.add(new Compra("Canetas", 10, 1.50));
        compras.add(new Compra("Cadernos", 5, 10.00));
        compras.add(new Compra("Borracha", 20, 0.50));
        compras.add(new Compra("Lápis", 15, 1.00));
        compras.add(new Compra("Marcadores", 8, 2.75));

        // Ordena as compras pelo valor total usando um Comparator
        compras.sort(new Comparator<Compra>() { //Usamos o método sort da classe comparator para fazer a ordenação dos objetos
            @Override
            public int compare(Compra c1, Compra c2) { //sobrescrita do método de comparação para comparar o valor total das compras
                return Double.compare(c1.calculaValorTotal(), c2.calculaValorTotal());
            }
        });

        // Exibe o conteúdo das compras ordenado
        System.out.println("Compras ordenadas pelo valor total:");
        for (Compra compra : compras) {
            System.out.println(compra);
        }
    }
}
