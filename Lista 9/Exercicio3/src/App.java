import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        Animal[][] matrizAnimais = new Animal[5][5];  // Array bidimensional de animais

        System.out.println("Adicione 4 animais na matriz de tamanho 5x5.");

        for (int i = 0; i < 4; i++) {
            System.out.print("Informe a linha (0 a 4): ");
            int linha = teclado.nextInt();
            System.out.print("Informe a coluna (0 a 4): ");
            int coluna = teclado.nextInt();
            teclado.nextLine(); // Consumir a quebra de linha

            System.out.print("Informe o tipo de animal (Cachorro, Galinha, Gato): ");
            String tipoAnimal = teclado.nextLine();

            // Criação do animal baseado no tipo informado
            Animal animal = null;
            switch (tipoAnimal.toLowerCase()) {
                case "cachorro":
                    animal = new Cachorro();
                    break;
                case "galinha":
                    animal = new Galinha();
                    break;
                case "gato":
                    animal = new Gato();
                    break;
                default:
                    System.out.println("Animal inválido.");
                    i--; // Desconta uma tentativa se o tipo for inválido
                    continue;
            }

            // Inserção do animal na matriz
            matrizAnimais[linha][coluna] = animal;
        }

        System.out.println("\nBarulhos dos animais na matriz:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (matrizAnimais[i][j] != null) {
                    System.out.print("Posição [" + i + "][" + j + "]: ");
                    matrizAnimais[i][j].barulho();
                }
            }
        }

        teclado.close();
    }
}
