import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        ArrayList<EmissaoCarbono> emissoes = new ArrayList<>(); /*a interface em sí não pode ser instaciada, mas podemos criar
        uma lista que salve objetos do tipos que implementam essa interface, no caso, Contrucao, Veiculo e Gado*/
        double totalEmissoes = 0.0;

        // Exemplo de cadastro de construção
        System.out.println("-------- Cadastro de Construção --------");
        System.out.println("Número de chaminés:");
        int numChamines = teclado.nextInt();
        double[] largurasChamine = new double[numChamines];
        int[] indicesAtividade = new int[numChamines];

        for (int i = 0; i < numChamines; i++) {
            System.out.println("Largura da chaminé " + (i + 1) + ":");
            largurasChamine[i] = teclado.nextDouble();
            System.out.println("Índice de atividade da chaminé " + (i + 1) + " (entre 10 e 1000):");
            indicesAtividade[i] = teclado.nextInt();
        }
        Construcao construcao = new Construcao(largurasChamine, indicesAtividade);
        emissoes.add(construcao);
        totalEmissoes += construcao.calculaEmissao(); //salva a quantidade de carbono emitida pela Construcao

        // Exemplo de cadastro de veículo
        System.out.println("\n-------- Cadastro de Veículo --------");
        System.out.println("Número de cilindros do motor:");
        int numeroCilindros = teclado.nextInt();
        System.out.println("Rotações por minuto do motor:");
        int rotacoesPorMinuto = teclado.nextInt();
        System.out.println("Fator de poluição (1 para Álcool, 2 para Gasolina, 3 para Diesel):");
        int fatorPoluicao = teclado.nextInt();

        Veiculo veiculo = new Veiculo(numeroCilindros, rotacoesPorMinuto, fatorPoluicao);
        emissoes.add(veiculo);
        totalEmissoes += veiculo.calculaEmissao(); //soma a quantidade emitada pelo Veiculo

        // Exemplo de cadastro de gado
        System.out.println("\n -------- Cadastro de Gado --------");
        System.out.println("Peso do gado (em kg):");
        double pesoGado = teclado.nextDouble();

        Gado gado = new Gado(pesoGado);
        emissoes.add(gado);
        totalEmissoes += gado.calculaEmissao(); //soma a quantidade emitada pelo Gado

        // Exibir o valor total das emissões de carbono dos bens cadastrados
        System.out.println("\nQuantidade total de carbono emitida por todos os objetos cadastrados: " + totalEmissoes);
        teclado.close();
    }
}
