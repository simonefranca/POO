class Consulta {
    private String nome;
    private String telefone;
    private String email;
    private String data;
    private String hora;

    // Construtor
    public Consulta(String nome, String telefone, String email, String data, String hora) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        setData(data);
        setHora(hora);
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        if (data.matches("\\d{2}/\\d{2}/\\d{4}")) { // Verifica formato de data "dd/mm/yyyy"
            this.data = data;
        } else {
            System.out.println("Data inválida! Formato esperado: dd/mm/yyyy");
        }
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        if (hora.matches("\\d{2}:\\d{2}")) { // Verifica formato de hora "hh:mm"
            this.hora = hora;
        } else {
            System.out.println("Hora inválida! Formato esperado: hh:mm");
        }
    }

    // Método para exibir informações da consulta
    public void exibirConsulta() {
        System.out.println("Consulta:");
        System.out.println("Nome: " + nome);
        System.out.println("Telefone: " + telefone);
        System.out.println("E-mail: " + email);
        System.out.println("Data: " + data);
        System.out.println("Hora: " + hora);
    }
}