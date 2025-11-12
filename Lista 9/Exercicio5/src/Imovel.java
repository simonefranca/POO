import java.util.Calendar;

public class Imovel extends Bem{
     private double valorInicial;
    private int anoConstrucao;
    private double taxaDepreciacao;

    public Imovel(String descricao, double valorInicial, int anoConstrucao, double taxaDepreciacao) {
        super(descricao);
        this.valorInicial = valorInicial;
        this.anoConstrucao = anoConstrucao;
        this.taxaDepreciacao = taxaDepreciacao;
    }

    @Override
    public double calculaValor() {
        int anoAtual = Calendar.getInstance().get(Calendar.YEAR); //usamos função da classe Calendar para pegar o ano atual
        int idade = anoAtual - anoConstrucao;
        return valorInicial - (valorInicial * idade * taxaDepreciacao);
    }
}
