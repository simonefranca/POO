public class Gado implements EmissaoCarbono{
    
    private double peso;

    public Gado(double peso) {
        this.peso = peso;
    }

    @Override //sobrescrita obriagatória do método da interface EmissaoCarbono
    public double calculaEmissao() {
        return peso * 0.7;
    }
}
