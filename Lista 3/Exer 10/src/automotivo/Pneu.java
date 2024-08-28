package automotivo;

public class Pneu {
    private String marca;
    private int tamanhoAro;

    public Pneu(String marca, int tamanhoAro) {
        this.marca = marca;
        this.tamanhoAro = tamanhoAro;
    }

    public String toString() {
        return "Pneu [Marca: " + marca + ", Aro: " + tamanhoAro + "]";
    }
}
