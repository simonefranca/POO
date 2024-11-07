public class Construcao implements EmissaoCarbono{
    private double[] largurasChamine;
    private int[] indicesAtividade;

    public Construcao(double[] largurasChamine, int[] indicesAtividade) {
        this.largurasChamine = largurasChamine;
        this.indicesAtividade = indicesAtividade;
    }

    @Override //sobrescrita obriagatória do método da interface EmissaoCarbono
    public double calculaEmissao() {
        double totalEmissao = 0.0;
        for (int i = 0; i < largurasChamine.length; i++) {
            totalEmissao += largurasChamine[i] * indicesAtividade[i];
        }
        return totalEmissao;
    }
}
