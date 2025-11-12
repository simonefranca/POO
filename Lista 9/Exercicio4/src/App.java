import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        ArrayList<EmpregadoFaculdade> empregados = new ArrayList<>(); 
        /*Como EmpregadoFaculdade é uma classe abstrata, não podemos instanciá-la diretamente,
         mas podemos criar uma lista de objetos do tipo EmpregadoFaculdade para armazenar suas
        subclasses, FuncionarioFaculdade e DocenteFaculdade*/
        double totalFolhaPagamento = 0.0;

        for (int i = 0; i < 4; i++) {
            System.out.println("Informe o tipo de funcionário (1 - Funcionário, 2 - Docente):");
            int tipo = teclado.nextInt();
            teclado.nextLine();  // Consumir nova linha

            System.out.println("Nome do funcionário:");
            String nome = teclado.nextLine();

            System.out.println("Salário base do funcionário:");
            double salarioBase = teclado.nextDouble();
            teclado.nextLine();  // Consumir nova linha

            if (tipo == 1) { // Funcionário
                System.out.println("Setor do funcionário:");
                String setor = teclado.nextLine();

                FuncionarioFaculdade funcionario = new FuncionarioFaculdade(nome, salarioBase, setor);
                empregados.add(funcionario);
                totalFolhaPagamento += funcionario.calculaSalario();

            } else if (tipo == 2) { // Docente
                System.out.println("Setor do docente:");
                String setor = teclado.nextLine();

                System.out.println("Quantidade de horas de aula:");
                int qtdHorasAula = teclado.nextInt();

                System.out.println("Valor por hora de aula:");
                double valorHoraAula = teclado.nextDouble();

                DocenteFaculdade docente = new DocenteFaculdade(nome, salarioBase, setor, qtdHorasAula, valorHoraAula);
                empregados.add(docente);
                totalFolhaPagamento += docente.calculaSalario();
            } else {
                System.out.println("Tipo inválido.");
                i--; // Repete a iteração se o tipo for inválido
            }

            System.out.println("\nFolha de pagamento total atual: R$ " + totalFolhaPagamento);
        }

        // Exibindo o salário individual de cada funcionário
        System.out.println("\nSalários dos funcionários cadastrados:");
        for (EmpregadoFaculdade empregado : empregados) {
            System.out.println("Nome: " + empregado.nome + ", Salário: R$ " + empregado.calculaSalario());
        }

        System.out.println("\nFolha de pagamento total: R$ " + totalFolhaPagamento);
        teclado.close();
    }
}
