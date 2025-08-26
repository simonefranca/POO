public class App {
    public static void main(String[] args) throws Exception {
        // Limite máximo para os lados do triângulo
        int limite = 500;

        // Laços triplamente aninhados para testar todas as combinações de a, b e c
        for (int a = 1; a < limite; a++) {
            for (int b = a; b < limite; b++) {
                for (int c = b; c < limite; c++) {
                    // Verifica se a combinação é um triplo de Pitágoras
                    if (a * a + b * b == c * c) {
                        System.out.printf("a: %d, b: %d, c: %d%n", a, b, c);
                    }
                }
            }
        }
    }
}
