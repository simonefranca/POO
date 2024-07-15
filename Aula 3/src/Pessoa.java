public class Pessoa {
    String nome;
    double altura;
    double peso;
    int idade;
    double salario;
    String profissao;
    public String cpf = "123.456.789-79";

    public Pessoa(){
        this.nome = "Fulano";
        this.altura = 1.55;
        this.peso = 51;
        this.idade = 37;
        this.profissao = "";
        this.salario = 300;
        this.cpf = "123.456.789-11";
    }

    public Pessoa(String nome, double altura, double peso, int idade, double salario, String profissao, String cpf){
        setNome(nome);
        setAltura(altura);
        setPeso(peso);
        setIdade(idade);
        setSalario(salario);
        setProfissao(profissao);
        setCpf(cpf);
    }

    public void alterarIdadePeso (int idadeNova, int pesoNovo)
    {
      this.idade = idadeNova;
      this.peso = pesoNovo;  
    }

    public double calculaImposto( double imposto){
        return salario * imposto;
    }

    public void imprimirPessoa ()
    {
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Altura: " + altura);
        System.out.println("Peso: "+ peso);
        System.out.println("Idade: "+ idade);
        System.out.println("Salário: "+ salario);
        System.out.println("Profissão: "+ profissao);
    }

    public boolean equals (Pessoa outraPessoa){
        if (!nome.equals(outraPessoa.getNome())) {
            return false;
        }
        if (altura != outraPessoa.getAltura()) {
            return false;
        }
        if (peso != outraPessoa.getPeso()){
            return false;
        }
        if (idade != outraPessoa.getIdade()) {
            return false;
        }
        if (!profissao.equals(outraPessoa.getProfissao())) {
            return false;
        }
        if (salario != outraPessoa.getSalario()) {
            return false;
        }
        if (!cpf.equals(outraPessoa.getCpf())) {
            return false;
        }
        return true;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public String getProfissao() {
        return profissao;
    }
    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}





