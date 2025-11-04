class Carro extends Veiculo {
    private int numeroPortas;

    // Construtor
    public Carro(String marca, String modelo, int ano, int numeroPortas) {
        super(marca, modelo, ano);
        this.numeroPortas = numeroPortas;
    }

    // Sobrescrita do método exibirDetalhes para exibir detalhes específicos do carro
    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Tipo: Carro, Portas: " + numeroPortas);
    }
}