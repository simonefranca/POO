import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        // Leitura do nome e salário do empregado
        System.out.print("Digite o nome do empregado: ");
        String nome = teclado.nextLine();

        System.out.print("Digite o salário bruto do empregado: ");
        double salarioBruto = teclado.nextDouble();

        // Criação do objeto Empregado
        Empregado empregado1 = new Empregado(nome, salarioBruto);

        // Exibição das informações do empregado
        System.out.println("Nome do Empregado: " + empregado1.getNome());
        System.out.println("Salário Bruto: R$ " + empregado1.getSalarioBruto());

        // Cálculo e exibição da renda anual
        double rendaAnual = empregado1.rendaAnual();
        System.out.println("Renda Anual Líquida: R$ " + rendaAnual);

        teclado.close();
    }
}
