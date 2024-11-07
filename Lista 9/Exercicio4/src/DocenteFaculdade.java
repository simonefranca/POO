public class DocenteFaculdade extends FuncionarioFaculdade{
    private int qtdHorasAula;
    private double valorHoraAula;

    public DocenteFaculdade(String nome, double salarioBase, String setor, int qtdHorasAula, double valorHoraAula) {
        super(nome, salarioBase, setor);
        this.qtdHorasAula = qtdHorasAula;
        this.valorHoraAula = valorHoraAula;
    }

    @Override
    public double calculaSalario() {
        return salarioBase + (qtdHorasAula * valorHoraAula);
    }
}
