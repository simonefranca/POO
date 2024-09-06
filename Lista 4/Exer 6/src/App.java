import java.util.Scanner;

public class App {
    // Atributos estáticos
    private static double nota1, nota2, nota3;

    public static void main(String[] args) {
        lerNotas();
        double media = calcularMedia();
        exibirMensagem(media);
    }

    // Método estático fazer a leitura das notas
    public static void lerNotas() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        nota2 = scanner.nextDouble();

        System.out.print("Digite a terceira nota: ");
        nota3 = scanner.nextDouble();
    }

    // Método estático para calcular a média
    public static double calcularMedia() {
        return (nota1 + nota2 + nota3) / 3;
    }

    // Método estático para exibir as mensagens
    public static void exibirMensagem(double media) {
        if (media < 3) {
            System.out.println("Bem ruim!");
        } else if (media >= 3 && media < 5) {
            System.out.println("Ainda insuficiente");
        } else if (media >= 5 && media < 6) {
            System.out.println("Na traaaaave!");
        } else if (media >= 6 && media < 8) {
            System.out.println("É...");
        } else if (media >= 8) {
            System.out.println("Boa!!!!!");
        }
    }
}
