class Veiculo {
    protected String marca;
    protected String modelo;
    protected int ano;

    // Construtor
    public Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    // Método para exibir detalhes genéricos do veículo
    public void exibirDetalhes() {
        System.out.println("Veículo: " + marca + " " + modelo + " (" + ano + ")");
    }
}