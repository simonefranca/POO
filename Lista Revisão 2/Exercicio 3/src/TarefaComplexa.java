public class TarefaComplexa extends Tarefa {

    public TarefaComplexa(String nome, String descricao, String status) {
        super(nome, descricao, status);
    }

    @Override
    public void executar() {
        System.out.println("Executando tarefa complexa: " + getNome());
        System.out.println("Descrição: " + getDescricao());
        System.out.println("Status atual: " + getStatus());
    }
}
