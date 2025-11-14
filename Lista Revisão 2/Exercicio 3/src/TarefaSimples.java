public class TarefaSimples extends Tarefa {

    public TarefaSimples(String nome, String descricao, String status) {
        super(nome, descricao, status);
    }

    @Override
    public void executar() {
        System.out.println("Executando tarefa simples: " + getNome());
    }
}
