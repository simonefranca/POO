import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);
        int a, b;
        System.out.println("Digite o valor de a:");
        a = teclado.nextInt();
        System.out.println("Digite o valor de b:");
        b = teclado.nextInt();

        //System.out.println("Resultado da soma de a+b é:"+ (a+b));

        if (a == b) {
            System.out.println("Os valores são iguais!");
        }else{
            System.out.println("Os valores são diferentes!");
            if (a>b) {
                System.out.println("O primeiro valor é maior que o segundo!");
            }else{
                System.out.println("O segundo valor é maior que o primeiro!");
            }
        }
    } 
}













