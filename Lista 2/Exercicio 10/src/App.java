import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        // Solicita que o usuário insira a massa em quilos e a altura em metros
        System.out.println("Digite a massa em quilos:");
        double massa = teclado.nextDouble();

        System.out.println("Digite a altura em metros:");
        double altura = teclado.nextDouble(); //Usa o Double para pegar o valor em metros

        // Calculo do IMC
        double imc = massa / (altura * altura);

        // Exibição do IMC calculado
        System.out.printf("Seu IMC é: %.2f\n", imc);

        // Exibição da tabela de classificações de IMC
        System.out.println("\nIMC\t\tClassificação");
        System.out.println("< 16\t\tMagreza grave");
        System.out.println("16 a < 17\tMagreza moderada");
        System.out.println("17 a < 18,5\tMagreza leve");
        System.out.println("18,5 a < 25\tSaudável");
        System.out.println("25 a < 30\tSobrepeso");
        System.out.println("30 a < 35\tObesidade Grau I");
        System.out.println("35 a < 40\tObesidade Grau II (severa)");
        System.out.println(">= 40\t\tObesidade Grau III (mórbida)");

        // Encontrar a faixa de IMC do usuário e exibir a classificação correspondente
        System.out.print("\nVocê está na faixa de: ");
        if (imc < 16) {
            System.out.println("Magreza grave");
        } else if (imc >= 16 && imc < 17) {
            System.out.println("Magreza moderada");
        } else if (imc >= 17 && imc < 18.5) {
            System.out.println("Magreza leve");
        } else if (imc >= 18.5 && imc < 25) {
            System.out.println("Saudável");
        } else if (imc >= 25 && imc < 30) {
            System.out.println("Sobrepeso");
        } else if (imc >= 30 && imc < 35) {
            System.out.println("Obesidade Grau I");
        } else if (imc >= 35 && imc < 40) {
            System.out.println("Obesidade Grau II (severa)");
        } else {
            System.out.println("Obesidade Grau III (mórbida)");
        }
    }
}
