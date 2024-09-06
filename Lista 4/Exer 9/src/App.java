import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        // Leitura da temperatura em Celsius e conversão para Fahrenheit
        System.out.print("Digite a temperatura em Celsius: ");
        double celsius = teclado.nextDouble();
        double fahrenheit = ConversorTemperatura.celsiusParaFahrenheit(celsius);
        System.out.println("Temperatura em Fahrenheit: " + fahrenheit);

        // Leitura da temperatura em Fahrenheit e conversão para Celsius
        System.out.print("Digite a temperatura em Fahrenheit: ");
        double fah = teclado.nextDouble();
        double cels = ConversorTemperatura.fahrenheitParaCelsius(fah);
        System.out.println("Temperatura em Celsius: " + cels);

        teclado.close();
    }
}
