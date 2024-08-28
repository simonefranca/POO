public class Empregado {
    private String nome;
    private double salarioBruto;

    // Construtor da classe
    public Empregado(String nome, double salarioBruto) {
        this.nome = nome;
        this.salarioBruto = salarioBruto;
    }

    // Métodos get() para os atributos
    public String getNome() {
        return nome;
    }

    public double getSalarioBruto() {
        return salarioBruto;
    }

    // Métodos set() para os atributos
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    // Método privado para calcular o imposto de renda
    private double calculaIR() {
        double imposto;

        if (salarioBruto <= 1903.98) {
            imposto = 0.0;
        } else if (salarioBruto <= 2826.65) {
            imposto = salarioBruto * 0.075;
        } else if (salarioBruto <= 3751.05) {
            imposto = salarioBruto * 0.15;
        } else if (salarioBruto <= 4664.68) {
            imposto = salarioBruto * 0.225;
        } else {
            imposto = salarioBruto * 0.275;
        }

        return imposto;
    }

    // Método público para calcular a renda líquida anual
    public double rendaAnual() {
        double impostoMensal = calculaIR();
        double salarioLiquidoMensal = salarioBruto - impostoMensal;
        return salarioLiquidoMensal * 12;
    }
}
