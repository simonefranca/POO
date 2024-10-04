public class App {
    public static void main(String[] args) throws Exception {
        // Criando um objeto Funcionario com valores definidos
        Funcionario funcionario = new Funcionario("João Silva", 3000.00, 5000.00, 0.10);

        // Invocando o método para imprimir o salário total
        funcionario.imprimeSalarioTotal();
    }
}
