class Livro extends ItemBiblioteca {
    private String autor;
    private int numeroPaginas;

    // Construtor
    public Livro(String titulo, int anoPublicacao, String autor, int numeroPaginas) {
        super(titulo, anoPublicacao);
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    // Sobrescrita do método exibirDetalhes
    @Override
    public void exibirDetalhes() {
        System.out.println("Livro: " + titulo + " (" + anoPublicacao + ")");
        System.out.println("Autor: " + autor + ", Páginas: " + numeroPaginas);
    }
}