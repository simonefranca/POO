public class Proprietario {
    private String nome;
    private String cpf;
    private String endereco;
    private String email;

    // Construtor
    public Proprietario(String nome, String cpf, String endereco, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.email = email;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String geteMail() {
        return email;
    }

    public void seteMail(String email) {
        this.email = email;
    }

    // Método toString
    @Override
    public String toString() {
        return "Proprietário{" +
               "Nome='" + nome + '\'' +
               ", CPF='" + cpf + '\'' +
               ", Endereço='" + endereco + '\'' +
               ", eMail='" + email + '\'' +
               '}';
    }
}
