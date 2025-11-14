import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        // Criando instâncias de TarefaSimples e TarefaComplexa
        Tarefa tarefa1 = new TarefaSimples("Tarefa Simples 1", "Descrição simples", "Pendente");
        Tarefa tarefa2 = new TarefaSimples("Tarefa Simples 2", "Outra descrição simples", "Em andamento");
        Tarefa tarefa3 = new TarefaComplexa("Tarefa Complexa 1", "Descrição detalhada da tarefa complexa", "Pendente");
        Tarefa tarefa4 = new TarefaComplexa("Tarefa Complexa 2", "Mais detalhes sobre tarefa complexa", "Finalizada");

        // Criando uma lista de tarefas
        ArrayList<Tarefa> tarefas = new ArrayList<>();
        tarefas.add(tarefa1);
        tarefas.add(tarefa2);
        tarefas.add(tarefa3);
        tarefas.add(tarefa4);

        // Iterando sobre a lista de tarefas e chamando o método executar() para cada tarefa
        for (Tarefa tarefa : tarefas) {
            tarefa.executar();
            System.out.println(); // Separando a saída das tarefas
        }
    }
}
