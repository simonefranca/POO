public class Aeronave {
    private String modelo;
    private int numeroFileiras;
    private int numeroAssentosPorFileira;

    // Construtor
    public Aeronave(String modelo, int numeroFileiras, int numeroAssentosPorFileira) {
        this.modelo = modelo;
        this.numeroFileiras = numeroFileiras;
        this.numeroAssentosPorFileira = numeroAssentosPorFileira;
    }

    // Getters
    public String getModelo() {
        return modelo;
    }

    public int getNumeroFileiras() {
        return numeroFileiras;
    }

    public int getNumeroAssentosPorFileira() {
        return numeroAssentosPorFileira;
    }

    // Método para imprimir as informações da aeronave
    @Override
    public String toString() {
        return "Modelo: " + modelo + ", Fileiras: " + numeroFileiras + 
               ", Assentos por Fileira: " + numeroAssentosPorFileira;
    }
}
