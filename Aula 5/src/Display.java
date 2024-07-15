public class Display {
    private int valor;
    private int limite;

    public Display(int limite){
        this.limite = limite;
        valor = 0;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
    //Método para salvar os valores que serão exibimos no display
    public String exibir(){
        String display = "";
        if (this.valor < 10) {
            display = "0" + valor;
        }else{
            display = "" + valor;
        }
        return display;
    }
    //método para incrementar o valor até que ele chegue ao limite
    public void incrementar(){
        valor = (valor+1) % limite; //O %limite pega o resto da divisão - quando atinge o limite o resto é 0 e o contador é zerado
        //Contadores de Ciclo - volta a zero após atingir um certo limite.
    }
}
