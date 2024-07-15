public class Relogio {
    private Display horas;
    private Display minutos;
    private Display segundos;
    
    public Relogio (){
        horas = new Display(24);
        minutos = new Display(60);
        segundos = new Display(60);
    }
    public Relogio (int hora, int minuto, int segundo){
        horas = new Display(24);
        minutos = new Display(60);
        segundos = new Display(60);

        horas.setValor(hora);
        minutos.setValor(minuto);
        segundos.setValor(segundo);
    }
    public void atualizar(){
        segundos.incrementar();
        if (segundos.getValor() == 0){
            minutos.incrementar();
            if (minutos.getValor() == 0) {
                horas.incrementar();
            }
        }
    }
    public void exibirHoras(){
        System.out.println("\r" + horas.exibir() + minutos.exibir() + segundos.exibir());
    }
}
