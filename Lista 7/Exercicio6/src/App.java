import java.text.DecimalFormat;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        
        // Taxas de conversão (Valores de 14/10/2024)
        double cotacaoDolar = 5.60;  // 1 Dólar = 5,60 Reais
        double cotacaoEuro = 6.10;   // 1 Euro = 6,10 Reais
        double cotacaoWon = 0.0041;  // 1 Won = 0,0041 Reais

        // Solicita ao usuário o valor em reais
        System.out.print("Digite o valor em reais (R$): ");
        double valorReais = teclado.nextDouble();

        // Solicita ao usuário o tipo de moeda
        System.out.println("Escolha a moeda para conversão -- Digite o número correspondente à moeda desejada:  ");
        System.out.println("1. Dólar");
        System.out.println("2. Euro");
        System.out.println("3. Won");
        int opcaoMoeda = teclado.nextInt();

        double valorConvertido = 0;
        String simboloMoeda = "";

        // Realiza a conversão com base na escolha do usuário
        switch (opcaoMoeda) {
            case 1:
                valorConvertido = valorReais / cotacaoDolar;
                simboloMoeda = "US$";
                break;
            case 2:
                valorConvertido = valorReais / cotacaoEuro;
                simboloMoeda = "€";
                break;
            case 3:
                valorConvertido = valorReais / cotacaoWon;
                simboloMoeda = "₩";
                break;
            default:
                System.out.println("Opção inválida. Programa encerrado!");
                return;
        }

        // Formata o valor convertido com duas casas decimais
        DecimalFormat df = new DecimalFormat("#,##0.00");

        // Exibe o resultado da conversão
        System.out.println("Valor convertido: " + simboloMoeda + " " + df.format(valorConvertido));

        teclado.close();
    }
}
