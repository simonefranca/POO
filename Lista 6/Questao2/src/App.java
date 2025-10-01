public class App {
    public static void main(String[] args) throws Exception {
        
        // Repetir código da questão anterior

        // Matriz inicializada com valores
        double[][] matriz = {
            {5.2, 9.8, 3.4},
            {12.5, 6.7, 2.1},
            {8.9, 4.3, 7.5}
        };

        // Inicializamos o maior e o menor valor com o primeiro elemento da matriz
        double maior = matriz[0][0];
        double menor = matriz[0][0];

        // Percorrer a matriz para encontrar o maior e o menor valor
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                }
                if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                }
            }
        }

        // Exibir o resultado
        System.out.println("Maior valor na matriz: " + maior);
        System.out.println("Menor valor na matriz: " + menor);
    }
}
