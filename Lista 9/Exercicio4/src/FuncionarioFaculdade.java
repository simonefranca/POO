public class FuncionarioFaculdade extends EmpregadoFaculdade{
    
    private String setor;

    public FuncionarioFaculdade(String nome, double salarioBase, String setor) {
        super(nome, salarioBase);
        this.setor = setor;
    }

    @Override
    public double calculaSalario() {
        return salarioBase;
    }
}
