public class App {
    public static void main(String[] args) throws Exception {
         // Gera e exibe números aleatórios
         System.out.println("Número inteiro aleatório entre 1 e 10: " + RandomGenerator.gerarInteiro(1, 10));
         System.out.println("Número decimal aleatório entre 0.0 e 1.0: " + RandomGenerator.gerarDouble(0.0, 1.0));
         System.out.println("Valor booleano aleatório: " + RandomGenerator.gerarBoolean());
    }
}
