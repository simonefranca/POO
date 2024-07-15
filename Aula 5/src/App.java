public class App {
    public static void main(String[] args) throws Exception {
        Relogio relogio = new Relogio();

        while(true){ //um loop que continuamente atualiza e exibe o relógio
            relogio.atualizar();
            relogio.exibirHoras();
            try{
                Thread.sleep(1000); //Faz o thread atual dormir (pausar a execução) por 1000 milissegundos, ou seja, 1 segundo. Isso faz com que o loop seja executado a cada segundo, atualizando e exibindo a hora em intervalos de um segundo.
            }catch(Exception e){
                System.err.println("Erro na atualização do Relógio!");
                System.exit(0);
            }
        }
    }
}
