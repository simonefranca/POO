import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        //< VERSÃO UTILIZANDO ARRAY //

        int[] numeros = new int[10]; // Array para armazenar os últimos 10 números
        int contador = 0;

        System.out.println("Digite apenas números inteiros -- Para encerrar digite -1:");

        while (true) {
            int numero = teclado.nextInt();
            
            if (numero == -1) {
                break; // Sai do loop ao digitar -1
            }

            // Armazena o número no array, sobrescrevendo as posições antigas
            numeros[contador % 10] = numero; //pega o resto da divisão para posicionar o array
            contador++;
        }

        // Exibe os últimos 10 números
        System.out.println("\nÚltimos 10 números digitados:");
        int inicio = (contador >= 10) ? contador % 10 : 0; //operador ternário, atribui um valor a variável dependendo se a condição for V ou F
        for (int i = 0; i < Math.min(10, contador); i++) {
            System.out.println(numeros[(inicio + i) % 10]);
        }

        //< VERSÃO UTILIZANDO ARRAYLIST //

        ArrayList<Integer> numeros2 = new ArrayList<>(); // ArrayList para armazenar os números

        System.out.println("Digite apenas números inteiros -- Para encerrar digite -1:");

        while (true) {
            int numero = teclado.nextInt();

            if (numero == -1) {
                break; // Sai do loop ao digitar -1
            }

            // Armazena o número no ArrayList
            numeros2.add(numero);

            // Mantém apenas os últimos 10 números
            if (numeros2.size() > 10) {
                numeros2.remove(0); // Remove o primeiro elemento para manter o tamanho em 10
            }
        }

        // Exibe os últimos 10 números
        System.out.println("\nÚltimos 10 números digitados:");
        for (int numero : numeros2) {
            System.out.println(numero);
        }

    }
}
