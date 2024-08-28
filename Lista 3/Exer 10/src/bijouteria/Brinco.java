package bijouteria;

public class Brinco {
    private String descricao;
    private String tipoMaterial;
    private double comprimento;

    public Brinco(String descricao, String tipoMaterial, double comprimento) {
        this.descricao = descricao;
        this.tipoMaterial = tipoMaterial;
        this.comprimento = comprimento;
    }

    @Override
    public String toString() {
        return "Brinco [Descrição: " + descricao + ", Material: " + tipoMaterial + ", Comprimento: " + comprimento + "cm]";
    }
}
