import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        // Leitura dos dados do primeiro celular
        System.out.println("Digite as informações do primeiro celular:");
        System.out.print("Marca: ");
        String marca1 = teclado.nextLine();
        System.out.print("Modelo: ");
        String modelo1 = teclado.nextLine();
        System.out.print("Quantidade de armazenamento (GB): ");
        double qtdArmazenamento1 = teclado.nextDouble();
        System.out.print("Quantidade de memória (GB): ");
        double qtdMemoria1 = teclado.nextDouble();
        System.out.print("Número de processadores: ");
        int numProcessadores1 = teclado.nextInt();
        teclado.nextLine();  // Consumir a quebra de linha

        Celular celular1 = new Celular(marca1, modelo1, qtdArmazenamento1, qtdMemoria1, numProcessadores1);

        // Leitura dos dados do segundo celular
        System.out.println("\nDigite as informações do segundo celular:");
        System.out.print("Marca: ");
        String marca2 = teclado.nextLine();
        System.out.print("Modelo: ");
        String modelo2 = teclado.nextLine();
        System.out.print("Quantidade de armazenamento (GB): ");
        double qtdArmazenamento2 = teclado.nextDouble();
        System.out.print("Quantidade de memória (GB): ");
        double qtdMemoria2 = teclado.nextDouble();
        System.out.print("Número de processadores: ");
        int numProcessadores2 = teclado.nextInt();

        Celular celular2 = new Celular(marca2, modelo2, qtdArmazenamento2, qtdMemoria2, numProcessadores2);

        // Comparação dos dois celulares
        int comparacao = celular1.compareTo(celular2);

        // Exibição dos resultados
        System.out.println("\nComparação dos celulares:");
        System.out.println("\nInformações Celular 1: " );
        celular1.imprimirInformacoes();
        System.out.println("\nInformações Celular 2: " );
        celular2.imprimirInformacoes();

        if (comparacao > 0) {
            System.out.println("\nO primeiro celular é melhor.");
        } else if (comparacao < 0) {
            System.out.println("\nO segundo celular é melhor.");
        } else {
            System.out.println("\nOs dois celulares têm a mesma qualidade.");
        }

        teclado.close();
    }
}
