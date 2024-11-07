public abstract class EmpregadoFaculdade {
    protected String nome;
    protected double salarioBase;

    public EmpregadoFaculdade(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public abstract double calculaSalario();
}
