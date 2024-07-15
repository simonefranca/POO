public class App {
    public static void main(String[] args) throws Exception {
        Pessoa fulano = new Pessoa("José", 1.50, 52, 37, 3500, "Professor", "123.123.123-00");
        Pessoa siclano = new Pessoa("Maria", 1.50, 52, 37, 3500, "Professor", "123.123.123-00");

        if (fulano.equals(siclano)) {
            System.out.println("As duas pessoas são iguais!");
        }else{
            System.out.println("As duas pessoas são diferentes!");
        }
    }
}


