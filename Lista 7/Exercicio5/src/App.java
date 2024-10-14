public class App {
    public static void main(String[] args) throws Exception {
         // Criação de um objeto Funcionario com valores definidos
         Funcionario funcionario = new Funcionario("Maria", 2500.00, 10000.00, 0.05);

         // Invoca o método para imprimir o salário total
         funcionario.imprimeSalarioTotal();
    }
}
