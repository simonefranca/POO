import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int counter = 1;       // Contador para o número de entradas
        int number;            // Número inserido mais recentemente
        int largest = Integer.MIN_VALUE;  // Inicializa com o menor valor possível

        while (counter <= 10) {
            System.out.print("Digite o número " + counter + ": ");
            number = scanner.nextInt();

            if (number > largest) {
                largest = number;
            }
            System.out.println("Contador: " + counter + ", Número inserido: " + number + ", Maior número até agora: " + largest);
            counter++;
        }
        System.out.println("O maior número inserido foi: " + largest);
    }
}
