class ItemBiblioteca {
    protected String titulo;
    protected int anoPublicacao;

    // Construtor
    public ItemBiblioteca(String titulo, int anoPublicacao) {
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
    }

    // Método para exibir detalhes
    public void exibirDetalhes() {
        System.out.println("Item: " + titulo + " (" + anoPublicacao + ")");
    }
}