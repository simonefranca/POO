import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o valor em reais para converter para dólares: ");
        double reais = teclado.nextDouble();
        double dolares = ConversorMoeda.realParaDolar(reais);
        System.out.println("Valor em dólares: " + dolares);

        System.out.print("Digite o valor em dólares para converter para reais: ");
        double dolaresParaReal = teclado.nextDouble();
        double reaisConvertidos = ConversorMoeda.dolarParaReal(dolaresParaReal);
        System.out.println("Valor em reais: " + reaisConvertidos);

        System.out.print("Digite o valor em reais para converter para euros: ");
        double reaisParaEuro = teclado.nextDouble();
        double euros = ConversorMoeda.realParaEuro(reaisParaEuro);
        System.out.println("Valor em euros: " + euros);

        System.out.print("Digite o valor em euros para converter para reais: ");
        double eurosParaReal = teclado.nextDouble();
        double reaisConvertidosEuro = ConversorMoeda.euroParaReal(eurosParaReal);
        System.out.println("Valor em reais: " + reaisConvertidosEuro);

        teclado.close();
    }
}
