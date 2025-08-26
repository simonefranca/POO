import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        
        while (true) {
            System.out.print("Digite o nome do vendedor (ou 'sair' para encerrar): ");
            String nome = teclado.nextLine();

            if (nome.equalsIgnoreCase("sair")) {
                System.out.println("Programa encerrado...");
                break;
            }

            Vendedor vendedor = new Vendedor(nome, 0);

            while (true) {
                System.out.print("Digite o valor do item vendido (ou -1 para finalizar): ");
                double valor = teclado.nextDouble();
                if (valor == -1) {
                    break;
                }
                vendedor.adicionarSaldo(valor);
            }

            System.out.println("O total vendido pelo vendedor " + vendedor.getNome() + " foi: R$ " + vendedor.getSaldo());

            // Limpa o buffer do Scanner
            teclado.nextLine();
        }

        teclado.close();
    }
}
