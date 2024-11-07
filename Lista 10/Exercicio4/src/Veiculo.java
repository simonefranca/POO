public class Veiculo implements EmissaoCarbono{
    private int numeroCilindrosMotor;
    private int rotacoesPorMinutoMotor;
    private int fatorDePoluicao; // 1 = Álcool, 2 = Gasolina, 3 = Diesel

    public Veiculo(int numeroCilindrosMotor, int rotacoesPorMinutoMotor, int fatorDePoluicao) {
        this.numeroCilindrosMotor = numeroCilindrosMotor;
        this.rotacoesPorMinutoMotor = rotacoesPorMinutoMotor;
        this.fatorDePoluicao = fatorDePoluicao;
    }

    @Override //sobrescrita obriagatória do método da interface EmissaoCarbono
    public double calculaEmissao() {
        return numeroCilindrosMotor * (rotacoesPorMinutoMotor / 1000.0) * fatorDePoluicao;
    }
}
