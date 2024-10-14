public class Musicas {
    private String titulo;
    private String artista;
    private String genero;

    // Construtor
    public Musicas(String titulo, String artista, String genero) {
        this.titulo = titulo;
        this.artista = artista;
        this.genero = genero;
    }

    // Getters
    public String getTitulo() {
        return titulo;
    }

    public String getArtista() {
        return artista;
    }

    public String getGenero() {
        return genero;
    }

    // toString para exibir informações da música
    @Override
    public String toString() {
        return "Título: " + titulo + ", Artista: " + artista + ", Gênero: " + genero;
    }
}
