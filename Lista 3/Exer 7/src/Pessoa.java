public class Pessoa {
    private String nome;
    private int idade;
    private int frequenciaCardiaca;

    // Construtor da classe
    public Pessoa(String nome, int idade, int frequenciaCardiaca) {
        this.nome = nome;
        this.idade = idade;
        this.frequenciaCardiaca = frequenciaCardiaca;
    }

    // Métodos get() para os atributos
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public int getFrequenciaCardiaca() {
        return frequenciaCardiaca;
    }

    // Método para verificar se a frequência cardíaca está acima da máxima permitida
    public boolean isFrequenciaCardiacaAcimaDoLimite() {
        int frequenciaCardiacaMaxima = 220 - idade;
        return frequenciaCardiaca > frequenciaCardiacaMaxima;
    }
}
