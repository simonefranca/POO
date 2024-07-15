public class Pessoa {
    private static int qtd_pessoas;
    private int id;
    private String nome;
    private String cpf;

    //Cria o construtor
    public Pessoa(String nome, String cpf){
        qtd_pessoas ++;
        this.id = qtd_pessoas;
        this.nome = nome;
        this.cpf = cpf;
    }

    //Método de impressão
    public void imprimeStatus(){
        System.out.println("==============================");
        System.out.println("Total de pessoas: "+ this.qtd_pessoas);
        System.out.println("ID: "+ this.id);
        System.out.println("Nome: "+ this.nome);
        System.out.println("CPF: "+ this.cpf);
        System.out.println("==============================");
    }
}
