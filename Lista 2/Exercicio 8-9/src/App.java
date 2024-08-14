import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        
        //Exercício 8
        // Solicita que o usuário digite um número inteiro
        System.out.println("Digite um número inteiro:");
        int numero = teclado.nextInt();

        // Verifica se o número é par ou ímpar
        if (numero % 2 == 0) {
            System.out.println("O número " + numero + " é par.");
        } else {
            System.out.println("O número " + numero + " é ímpar.");
        }

        //Exercício 9
        // Solicita que o usuário digite dois números inteiros
        System.out.println("Digite o primeiro número inteiro:");
        int num1 = teclado.nextInt();

        System.out.println("Digite o segundo número inteiro:");
        int num2 = teclado.nextInt();

        // Verificar se o primeiro número é múltiplo do segundo
        if (num2 != 0 && num1 % num2 == 0) {
            System.out.println("O número " + num1 + " eh múltiplo de " + num2);
        } else {
            System.out.println("O número " + num1 + " não eh múltiplo de " + num2);
        }
    }
}
