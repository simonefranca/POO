class Revista extends ItemBiblioteca {
    private String editora;
    private int numeroEdicao;

    // Construtor
    public Revista(String titulo, int anoPublicacao, String editora, int numeroEdicao) {
        super(titulo, anoPublicacao);
        this.editora = editora;
        this.numeroEdicao = numeroEdicao;
    }

    // Sobrescrita do método exibirDetalhes
    @Override
    public void exibirDetalhes() {
        System.out.println("Revista: " + titulo + " (" + anoPublicacao + ")");
        System.out.println("Editora: " + editora + ", Edição: " + numeroEdicao);
    }
}