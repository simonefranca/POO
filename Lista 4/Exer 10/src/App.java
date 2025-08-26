import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double num1 = teclado.nextDouble();
        System.out.print("Digite o segundo número: ");
        double num2 = teclado.nextDouble();

        System.out.println("Soma: " + Calculadora.somar(num1, num2));
        System.out.println("Subtração: " + Calculadora.subtrair(num1, num2));
        System.out.println("Multiplicação: " + Calculadora.multiplicar(num1, num2));
        System.out.println("Divisão: " + Calculadora.dividir(num1, num2));

        teclado.close();
    }
}
