public abstract class Tarefa {
    private String nome;
    private String descricao;
    private String status;

    // Construtor
    public Tarefa(String nome, String descricao, String status) {
        this.nome = nome;
        this.descricao = descricao;
        this.status = status;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    // Método abstrato a ser implementado pelas subclasses
    public abstract void executar();
}
