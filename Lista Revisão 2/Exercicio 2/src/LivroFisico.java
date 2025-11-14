public class LivroFisico extends Livro {
    private int numeroDePaginas;

    public LivroFisico(String titulo, String autor, String editora, int anoPublicacao, int numeroDePaginas) {
        super(titulo, autor, editora, anoPublicacao);
        this.numeroDePaginas = numeroDePaginas;
    }

    public int getNumeroDePaginas() {
        return numeroDePaginas;
    }

    @Override
    public void mostrarDetalhes() {
        System.out.println("Título: " + getTitulo());
        System.out.println("Autor: " + getAutor());
        System.out.println("Editora: " + getEditora());
        System.out.println("Ano de Publicação: " + getAnoPublicacao());
        System.out.println("Número de Páginas: " + numeroDePaginas);
    }
}
