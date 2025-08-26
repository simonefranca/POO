import java.util.Random;

public class RandomGenerator {
    // Instância de Random para gerar valores aleatórios
    private static Random random = new Random();

    public static int gerarInteiro(int min, int max) {
        return random.nextInt((max - min) + 1) + min;
    }

    public static double gerarDouble(double min, double max) {
        return min + (max - min) * random.nextDouble();
    }

    public static boolean gerarBoolean() {
        return random.nextBoolean();
    }
}
