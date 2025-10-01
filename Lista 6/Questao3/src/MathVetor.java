public class MathVetor {

    // Método para calcular a soma dos elementos de um vetor
    public static double somaVetor(double[] vetor) {
        double soma = 0;
        for (double v : vetor) {
            soma += v;
        }
        return soma;
    }

    // Método para calcular o produto dos elementos de um vetor
    public static double produtoVetor(double[] vetor) {
        double produto = 1;
        for (double v : vetor) {
            produto *= v;
        }
        return produto;
    }

    // Método para calcular a soma dos elementos de uma matriz
    public static double somaMatriz(double[][] matriz) {
        double soma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                soma += matriz[i][j];
            }
        }
        return soma;
    }

    // Método para calcular o produto dos elementos de uma matriz
    public static double produtoMatriz(double[][] matriz) {
        double produto = 1;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                produto *= matriz[i][j];
            }
        }
        return produto;
    }

    // Método para multiplicar duas matrizes
    public static double[][] multiplicaMatrizes(double[][] matrizA, double[][] matrizB) {
        int linhasA = matrizA.length;
        int colunasA = matrizA[0].length;
        int linhasB = matrizB.length;
        int colunasB = matrizB[0].length;

        // Verificar se é possível multiplicar as matrizes
        if (colunasA != linhasB) {
            throw new IllegalArgumentException("Número de colunas da Matriz A deve ser igual ao número de linhas da Matriz B.");
        }

        double[][] resultado = new double[linhasA][colunasB];

        // Realizar a multiplicação
        for (int i = 0; i < linhasA; i++) {
            for (int j = 0; j < colunasB; j++) {
                resultado[i][j] = 0;
                for (int k = 0; k < colunasA; k++) {
                    resultado[i][j] += matrizA[i][k] * matrizB[k][j];
                }
            }
        }
        return resultado;
    }

    // Método para exibir uma matriz
    public static void exibeMatriz(double[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
