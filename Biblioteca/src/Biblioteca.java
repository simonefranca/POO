public class Biblioteca {
    private Livro[] livros; // Máximo de 100 livros
    private Usuario[] usuarios; // Máximo de 100 usuários
    private int livrosCount;
    private int usuariosCount;

    public Biblioteca() {
        this.livros = new Livro[100];
        this.usuarios = new Usuario[100];
        this.livrosCount = 0;
        this.usuariosCount = 0;
    }

    // Adiciona um novo livro à biblioteca
    public void adicionarLivro(Livro livro) {
        if (livrosCount < 100) {
            livros[livrosCount] = livro;
            livrosCount++;
        } else {
            System.out.println("Limite de livros atingido.");
        }
    }

    // Registra um novo usuário na biblioteca
    public void registrarUsuario(Usuario usuario) {
        if (usuariosCount < 100) {
            usuarios[usuariosCount] = usuario;
            usuariosCount++;
        } else {
            System.out.println("Limite de usuários atingido.");
        }
    }

    // Empresta um livro para um usuário
    public boolean emprestarLivro(Usuario usuario, Livro livro) {
        if (!livro.isDisponivel()) {
            System.out.println("Livro não está disponível.");
            return false;
        }

        if (!usuario.podeEmprestarMaisLivros()) {
            System.out.println("Usuário já atingiu o limite de livros.");
            return false;
        }

        livro.setDisponivel(false);
        usuario.adicionarLivro(livro);
        System.out.println("Livro " + livro.getTitulo() + " emprestado a " + usuario.getNome() + ".");
        return true;
    }

    // Devolve um livro emprestado por um usuário
    public void devolverLivro(Usuario usuario, Livro livro) {
        usuario.removerLivro(livro);
        livro.setDisponivel(true);
        System.out.println("Livro " + livro.getTitulo() + " devolvido por " + usuario.getNome() + ".");
    }

    // Lista todos os livros disponíveis para empréstimo
    public void listarLivrosDisponiveis() {
        System.out.println("Livros disponíveis para empréstimo:");
        for (int i = 0; i < livrosCount; i++) {
            if (livros[i].isDisponivel()) {
                System.out.println("- " + livros[i].getTitulo() + " por " + livros[i].getAutor());
            }
        }
    }

    // Lista todos os livros emprestados por um usuário
    public void listarLivrosEmprestadosPorUsuario(Usuario usuario) {
        usuario.listarLivrosEmprestados();
    }
}
