public class Gerente extends Funcionario {
    private String departamento;

    // Construtor
    public Gerente(String nome, double salario, String departamento) {
        super(nome, salario);
        this.departamento = departamento;
    }

    // Sobrescrita do método calcularBonus para Gerente
    @Override
    public double calcularBonus() {
        return salario * 0.10;
    }

    // Getter para o departamento
    public String getDepartamento() {
        return departamento;
    }
}