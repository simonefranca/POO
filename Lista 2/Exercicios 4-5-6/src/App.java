import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        //Exercício 4
        Scanner teclado = new Scanner(System.in); //instânciado apenas uma vez, e utilizado em todo o programa para fazer as leituras do teclado

        System.out.println("Digite o primeiro número inteiro:");
        int num1 = teclado.nextInt();

        System.out.println("Digite o segundo número inteiro:");
        int num2 = teclado.nextInt();

        System.out.println("Digite o terceiro número inteiro:");
        int num3 = teclado.nextInt();

        int produto = num1 * num2 * num3;

        System.out.println("O produto dos três números é: " + produto);

        //Exercício 5
         // Declarando a variável inteira dentro do programa
         int variavelInteira = 3;

         System.out.println("Digite um número inteiro:");
         int numero = teclado.nextInt();
 
         // Comparando o número fornecido com a variável declarada
         if (numero > variavelInteira) {
             System.out.println("O número digitado é maior que " + variavelInteira);
         } else if (numero < variavelInteira) {
             System.out.println("O número digitado é menor que " + variavelInteira);
         } else {
             System.out.println("O número digitado é igual a " + variavelInteira);
         }

        //Exercício 6
        int x;
        // (a) x = 7 + 3 * 6 / 2 - 1;
        x = 7 + 3 * 6 / 2 - 1;
        System.out.println("Valor de x na expressão (a): " + x);

        // (b) x = 2 % 2 + 2 * 2 - 2 / 2;
        x = 2 % 2 + 2 * 2 - 2 / 2;
        System.out.println("Valor de x na expressão (b): " + x);

        // (c) x = (3 * 9 * (3 + (9 * 3 / 3)));
        x = 3 * 9 * (3 + (9 * 3 / 3));
        System.out.println("Valor de x na expressão (c): " + x);
    }
}
