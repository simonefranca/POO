public class Calculadora {
    public static double somar(double a, double b) {
        return a + b;
    }

    public static double subtrair(double a, double b) {
        return a - b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static double dividir(double a, double b) {
        // Verifica se o divisor é zero para evitar divisão por zero
        if (b == 0) {
            System.out.println("Erro: Divisão por zero não é permitida.");
            return 0; // Retorna zero ou lança exceção, conforme a necessidade
        }
        return a / b;
    }
}
