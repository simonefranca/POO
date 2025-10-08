import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Cria o ArrayList para armazenar as cores
        ArrayList<String> cores = new ArrayList<>();
        Scanner teclado = new Scanner(System.in);

        // Solicita ao usuário para inserir 5 cores
        System.out.println("Informe as 5 cores:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Cor " + (i + 1) + ": ");
            String cor = teclado.nextLine();
            cores.add(cor); //adiciona a variavel 'cor' no arrayList por meio do método add
        }

        // Exibe o ArrayList antes da substituição
        System.out.println("\nCores do ArrayList: " + cores);

        // Solicita ao usuário para inserir a posição da cor a ser substituída
        System.out.print("\nEscolha o número da cor, de 1 a 5, que deseja substituir: ");
        int indice = teclado.nextInt();
        teclado.nextLine(); // Consumir a nova linha após o número, "limpar o buffer"

        // Verifica se o índice é válido
        if (indice > 0 && indice <= 5) {
            // Solicita ao usuário para inserir a nova cor
            System.out.print("Digite a nova cor: ");
            String novaCor = teclado.nextLine();

            // Substitui a cor na posição escolhida
            cores.set(indice - 1, novaCor); //usa o método set para modificar uma posição específica do ArrayList

            // Exibe o ArrayList após a substituição
            System.out.println("\nCores atualizadas: " + cores);
        } else {
            System.out.println("\nÍndice inválido. Por favor, escolha um número entre 1 e 5.");
        }
    }
}
