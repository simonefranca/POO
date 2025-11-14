public class EBook extends Livro {
    private double tamanhoArquivo; // Tamanho do arquivo em MB

    public EBook(String titulo, String autor, String editora, int anoPublicacao, double tamanhoArquivo) {
        super(titulo, autor, editora, anoPublicacao);
        this.tamanhoArquivo = tamanhoArquivo;
    }

    public double getTamanhoArquivo() {
        return tamanhoArquivo;
    }

    @Override
    public void mostrarDetalhes() {
        System.out.println("Título: " + getTitulo());
        System.out.println("Autor: " + getAutor());
        System.out.println("Editora: " + getEditora());
        System.out.println("Ano de Publicação: " + getAnoPublicacao());
        System.out.println("Tamanho do Arquivo: " + tamanhoArquivo + " MB");
    }
}
