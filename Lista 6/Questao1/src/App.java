public class App {
    public static void main(String[] args) throws Exception {
        // Vetor inicializado com valores
        double[] vetor = {5.2, 9.8, 3.4, 12.5, 6.7, 2.1};
        
        // Variáveis para armazenar o maior e o menor valor
        double maior = vetor[0];
        double menor = vetor[0];

        // Percorrer o vetor para encontrar o maior e o menor valor
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
            if (vetor[i] < menor) {
                menor = vetor[i];
            }
        }

        // Exibir o resultado
        System.out.println("Maior valor no vetor: " + maior);
        System.out.println("Menor valor no vetor: " + menor);
    }
}
