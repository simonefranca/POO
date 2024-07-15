public class Matematica {
    public static double eleva(double base, int expoente){
        double resultado = 1;

        for(int i=0; i<expoente; i++){
            resultado *= base;
        }
        return resultado;
    }
}

