public abstract class Bem {
    protected String descricao;

    public Bem(String descricao) {
        this.descricao = descricao;
    }

    // Método abstrato para calcular o valor total do bem
    public abstract double calculaValor();
}
