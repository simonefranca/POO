import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        ArrayList<Bem> bens = new ArrayList<>(); /*Não podemos instanciar diratamente objetos da classe Bem,
        mas pdoemos criar uma lista que salva objetos de Produto e Imóvel que são suas subclasses, 
        e não são abstratas */
        double totalBens = 0.0;

        System.out.println("Quantos bens deseja cadastrar?");
        int numBens = teclado.nextInt();
        teclado.nextLine(); // Consumir nova linha

        for (int i = 0; i < numBens; i++) {
            System.out.println("Informe o tipo de bem (1 para Produto, 2 para Imóvel):");
            int tipo = teclado.nextInt();
            teclado.nextLine(); // Consumir nova linha

            System.out.println("Descrição:");
            String descricao = teclado.nextLine();

            if (tipo == 1) { // Produto
                System.out.println("Quantidade em estoque:");
                int quantidade = teclado.nextInt();
                System.out.println("Valor unitário:");
                double valorUnitario = teclado.nextDouble();

                Produto produto = new Produto(descricao, quantidade, valorUnitario);
                bens.add(produto);
                totalBens += produto.calculaValor();
            } else if (tipo == 2) { // Imóvel
                System.out.println("Valor inicial:");
                double valorInicial = teclado.nextDouble();
                System.out.println("Ano de construção:");
                int anoConstrucao = teclado.nextInt();
                System.out.println("Taxa de depreciação (ex.: 0,05 para 5% ao ano):");
                double taxaDepreciacao = teclado.nextDouble();

                Imovel imovel = new Imovel(descricao, valorInicial, anoConstrucao, taxaDepreciacao);
                bens.add(imovel);
                totalBens += imovel.calculaValor();
            } else {
                System.out.println("Tipo inválido.");
                i--; // Repetir a iteração em caso de tipo inválido
            }
        }

        // Exibir o valor total dos bens cadastrados
        System.out.println("\nValor total dos bens cadastrados: R$ " + totalBens);
        teclado.close();
    }
}
