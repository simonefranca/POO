public class Usuario {
    private String nome;
    private String cpf;
    private Livro[] livrosEmprestados; // Cada usuário pode pegar no máximo 3 livros
    private int livrosEmprestadosCount;

    public Usuario(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.livrosEmprestados = new Livro[3]; // Máximo de 3 livros
        this.livrosEmprestadosCount = 0;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public boolean podeEmprestarMaisLivros() {
        return livrosEmprestadosCount < 3;
    }

    public void adicionarLivro(Livro livro) {
        if (livrosEmprestadosCount < 3) {
            livrosEmprestados[livrosEmprestadosCount] = livro;
            livrosEmprestadosCount++;
        } else {
            System.out.println("Usuário já atingiu o limite de livros emprestados.");
        }
    }

    public void removerLivro(Livro livro) {
        for (int i = 0; i < livrosEmprestadosCount; i++) {
            if (livrosEmprestados[i] == livro) {
                livrosEmprestados[i] = livrosEmprestados[livrosEmprestadosCount - 1]; // Substitui o livro pelo último
                livrosEmprestados[livrosEmprestadosCount - 1] = null;
                livrosEmprestadosCount--;
                return;
            }
        }
        System.out.println("Livro não encontrado nos empréstimos do usuário.");
    }

    public void listarLivrosEmprestados() {
        System.out.println("Livros emprestados por " + nome + ":");
        for (int i = 0; i < livrosEmprestadosCount; i++) {
            System.out.println("- " + livrosEmprestados[i].getTitulo());
        }
    }
}
