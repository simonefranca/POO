
public class App {
    public static void main(String[] args) throws Exception {

        Biblioteca biblioteca = new Biblioteca();

        // Adicionando alguns livros
        biblioteca.adicionarLivro(new Livro("Dom Quixote", "Miguel de Cervantes"));
        biblioteca.adicionarLivro(new Livro("1984", "George Orwell"));
        biblioteca.adicionarLivro(new Livro("O Senhor dos Anéis", "J.R.R. Tolkien"));

        // Registrando alguns usuários
        Usuario usuario1 = new Usuario("João", "12345678901");
        Usuario usuario2 = new Usuario("Maria", "98765432100");
        biblioteca.registrarUsuario(usuario1);
        biblioteca.registrarUsuario(usuario2);

        // Operações de empréstimo e devolução
        biblioteca.emprestarLivro(usuario1, new Livro("Dom Quixote", "Miguel de Cervantes"));
        biblioteca.listarLivrosDisponiveis();
        biblioteca.listarLivrosEmprestadosPorUsuario(usuario1);

        biblioteca.emprestarLivro(usuario2, new Livro("1984", "George Orwell"));
        biblioteca.listarLivrosEmprestadosPorUsuario(usuario2);

        biblioteca.devolverLivro(usuario1, new Livro("Dom Quixote", "Miguel de Cervantes"));
        biblioteca.listarLivrosDisponiveis();

    }
}
