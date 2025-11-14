import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        // Criação das instâncias de livros
        Livro livroFisico1 = new LivroFisico("O Senhor dos Anéis", "J.R.R. Tolkien", "HarperCollins", 1954, 1216);
        Livro livroFisico2 = new LivroFisico("1984", "George Orwell", "Companhia das Letras", 1949, 368);
        Livro eBook1 = new EBook("A Arte da Guerra", "Sun Tzu", "L&PM Editores", 500, 1.5);
        Livro eBook2 = new EBook("Dom Casmurro", "Machado de Assis", "Editora Abril", 1899, 3.2);

        // Criando uma lista de livros (misturando LivroFisico e EBook)
        ArrayList<Livro> biblioteca = new ArrayList<>();
        biblioteca.add(livroFisico1);
        biblioteca.add(livroFisico2);
        biblioteca.add(eBook1);
        biblioteca.add(eBook2);

        // Exibindo os detalhes de cada livro
        for (Livro livro : biblioteca) {
            livro.mostrarDetalhes();
            System.out.println(); // Separação entre os detalhes dos livros
        }
    }
}
