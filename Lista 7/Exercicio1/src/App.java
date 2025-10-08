import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //Criamos o Array para inteiros
        ArrayList<Integer> numeros = new ArrayList<>();

        Scanner teclado = new Scanner(System.in);

        // Solicita 10 números inteiros ao usuário
        System.out.println("Por favor, insira 10 números inteiros:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            int numero = teclado.nextInt();
            numeros.add(numero); //adiciona o número digitada a lista
        }

        // Exibe o ArrayList antes da remoção
        System.out.println("\nArrayList atual: " + numeros);

        // Solicita um número para remover
        System.out.print("\nDigite um número para remover do ArrayList: ");
        int numeroParaRemover = teclado.nextInt();

        // Remove o número se ele existir no ArrayList
        if (numeros.contains(numeroParaRemover)) {
            numeros.remove(Integer.valueOf(numeroParaRemover)); //usa o método remove para remover o número se ele estiver na lista
            System.out.println("\nNúmero removido com sucesso.");
        } else {
            System.out.println("\nO número não está presente no ArrayList.");
        }

        // Exibe o ArrayList após a remoção
        System.out.println("\nArrayList após a remoção: " + numeros);
    }
}
