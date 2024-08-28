package bijouteria;

public class Anel {
    private String tipoMaterial;
    private double largura;
    private double diametro;

    public Anel(String tipoMaterial, double largura, double diametro) {
        this.tipoMaterial = tipoMaterial;
        this.largura = largura;
        this.diametro = diametro;
    } 
     
    @Override
    public String toString() {
        return "Anel [Material: " + tipoMaterial + ", Largura: " + largura + "mm, Diâmetro: " + diametro + "mm]";
    } 
}
