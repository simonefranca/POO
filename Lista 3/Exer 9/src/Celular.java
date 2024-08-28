public class Celular {
    private String marca;
    private String modelo;
    private double qtdArmazenamento;
    private double qtdMemoria;
    private int numProcessadores;

    // Construtor da classe
    public Celular(String marca, String modelo, double qtdArmazenamento, double qtdMemoria, int numProcessadores) {
        this.marca = marca;
        this.modelo = modelo;
        this.qtdArmazenamento = qtdArmazenamento;
        this.qtdMemoria = qtdMemoria;
        this.numProcessadores = numProcessadores;
    }

    // Método que calcula a pontuação do celular
    public double calculaPontuacao() {
        return qtdArmazenamento * qtdMemoria * numProcessadores;
    }

    // Método para comparar dois celulares
    public int compareTo(Celular outroCelular) {
        double minhaPontuacao = this.calculaPontuacao();
        double outraPontuacao = outroCelular.calculaPontuacao();

        if (minhaPontuacao > outraPontuacao) {
            return 1;
        } else if (minhaPontuacao < outraPontuacao) {
            return -1;
        } else {
            return 0;
        }
    }

    // Métodos get() para exibir as informações do celular
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getQtdArmazenamento() {
        return qtdArmazenamento;
    }

    public double getQtdMemoria() {
        return qtdMemoria;
    }

    public int getNumProcessadores() {
        return numProcessadores;
    }


    public void imprimirInformacoes() {
       System.err.println("Marca: "+this.marca);
       System.err.println("Modelo: "+this.modelo);
       System.err.println("Quantidade de Armazenamento: "+this.qtdArmazenamento);
       System.err.println("Quantidade de Memória: "+this.qtdMemoria);
       System.err.println("Número de Processadores: "+this.numProcessadores);
    }
}
