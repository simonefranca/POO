public class App {
    public static void main(String[] args) throws Exception {
          // Vetores para teste
          double[] vetor = {1, 2, 3, 4, 5};

          // Matrizes para teste
          double[][] matrizA = {
              {1, 2, 3},
              {4, 5, 6}
          };
  
          double[][] matrizB = {
              {7, 8},
              {9, 10},
              {11, 12}
          };
  
          // Soma e Produto do Vetor
          System.out.println("Soma do vetor: " + MathVetor.somaVetor(vetor));
          System.out.println("Produto do vetor: " + MathVetor.produtoVetor(vetor));
  
          // Soma e Produto da Matriz
          System.out.println("Soma da matriz A: " + MathVetor.somaMatriz(matrizA));
          System.out.println("Produto da matriz A: " + MathVetor.produtoMatriz(matrizA));
  
          // Multiplicação de Matrizes
          System.out.println("Resultado da multiplicação de matrizes A e B:");
          double[][] resultadoMultiplicacao = MathVetor.multiplicaMatrizes(matrizA, matrizB);
          MathVetor.exibeMatriz(resultadoMultiplicacao);
    }
}
