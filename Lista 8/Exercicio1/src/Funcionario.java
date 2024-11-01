public class Funcionario {
    protected String nome;
    protected double salario;

    // Construtor
    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    // Método genérico de cálculo de bônus
    public double calcularBonus() {
        return salario * 0.01; // Bônus genérico de 1%
    }

    // Getters para acessar os atributos
    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }
}