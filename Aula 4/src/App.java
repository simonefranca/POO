import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        double num1 = 3.4;
        double num2 = 8.1;

        num1 = Math.ceil(num1); //Arredonda o número para cima
        num2 = Math.floor(num2); //Arredonda número para baixo

        System.out.println("Num 1: "+ num1);
        System.out.println("Num 2:"+ num2);

        System.out.println("O maior dos números é:"+ Math.max(num1, num2));
        System.out.println("A raiz quadrada do num 2 é: "+ Math.sqrt(num2));

        Pessoa pessoa1 = new Pessoa("Vitor", "000.000.000-00");
        Pessoa pessoa2 = new Pessoa("Márcio", "111.111.111-11");
        Pessoa pessoa3 = new Pessoa("Jorge", "222.222.222-22");

        pessoa1.imprimeStatus();
        pessoa2.imprimeStatus();
        pessoa3.imprimeStatus();

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o raio do círculo: ");
        double raio = teclado.nextDouble();

        double area = Math.PI * Math.pow(raio, 2);
        double perimetro = 2 * Math.PI * raio;

        System.out.println("A área do círculo é: " + area);
        System.out.println("O perímetro do círculo é: " + perimetro);

        String boolStr = "true";
        boolean bool = Boolean.parseBoolean(boolStr);
        System.out.println(bool); // Saída: true

        String numberStr = "123";
        int number = Integer.parseInt(numberStr);
        System.out.println(number); // Saída: 123


    }
}
