class Moto extends Veiculo {
    private String tipo; // ex: esportiva, cruiser

    // Construtor
    public Moto(String marca, String modelo, int ano, String tipo) {
        super(marca, modelo, ano);
        this.tipo = tipo;
    }

    // Sobrescrita do método exibirDetalhes para exibir detalhes específicos da moto
    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Tipo: Moto, Categoria: " + tipo);
    }
}