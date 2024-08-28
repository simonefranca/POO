package eletronicos;

public class TV {
    private String marca;
    private String modelo;
    private int numPolegadas;

    public TV(String marca, String modelo, int numPolegadas) {
        this.marca = marca;
        this.modelo = modelo;
        this.numPolegadas = numPolegadas;
    }

    @Override
    public String toString() {
        return "TV [Marca: " + marca + ", Modelo: " + modelo + ", Polegadas: " + numPolegadas + "]";
    }
}
