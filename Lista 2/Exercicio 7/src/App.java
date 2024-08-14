import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        // Solicita que o usuário digite três números inteiros
        System.out.println("Digite o primeiro número inteiro:");
        int num1 = teclado.nextInt();

        System.out.println("Digite o segundo número inteiro:");
        int num2 = teclado.nextInt();

        System.out.println("Digite o terceiro número inteiro:");
        int num3 = teclado.nextInt();

        // Calcula a soma, média, e produto
        int soma = num1 + num2 + num3;
        double media = soma / 3.0; // Usar 3.0 para forçar a divisão por um double, resultando em um double
        int produto = num1 * num2 * num3;

        // Encontrar o maior número
        int maior = num1;
        if (num2 > maior) {
            maior = num2;
        }
        if (num3 > maior) {
            maior = num3;
        }

        // Exibir os resultados
        System.out.println("Soma dos números: " + soma);
        System.out.println("Média dos números: " + media);
        System.out.println("Produto dos números: " + produto);
        System.out.println("Maior número: " + maior);
    }
}
