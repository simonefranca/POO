public class App {
    public static void main(String[] args) throws Exception {
        //Objeto da classe Musica
        Musica musica = new Musica(
                "Bohemian Rhapsody",
                "Queen",
                "Rock",
                1975,
                "A Night at the Opera",
                "EMI",
                "Roy Thomas Baker",
                "Freddie Mercury"
        );

        // Objeto da classe Filme
        Filme filme = new Filme(
                "The Matrix",
                "Keanu Reeves, Laurence Fishburne, Carrie-Anne Moss",
                "Ficção Científica",
                1999,
                "Warner Bros.",
                "Lana Wachowski, Lilly Wachowski"
        );

        // Imprimindo as informações dos objetos
        System.out.println("Informações da Música:\n" + musica + "\n");
        System.out.println("Informações do Filme:\n" + filme);
    }
}
