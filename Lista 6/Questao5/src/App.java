import java.time.LocalTime;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Criação de algumas aeronaves
        Aeronave aeronave1 = new Aeronave("Boeing 737", 10, 6);
        Aeronave aeronave2 = new Aeronave("Airbus A320", 12, 4);

        // Criação de alguns voos
        Voo[] voos = new Voo[3];
        voos[0] = new Voo("São Paulo", "Rio de Janeiro", LocalTime.of(14, 30), aeronave1);
        voos[1] = new Voo("Brasília", "Salvador", LocalTime.of(16, 0), aeronave2);
        voos[2] = new Voo("Recife", "Fortaleza", LocalTime.of(18, 45), aeronave1);

        Scanner teclado = new Scanner(System.in);

        System.out.println("Bem-vindo ao sistema de reservas de voos!");

        System.out.print("Digite a cidade de origem: ");
        String origem = teclado.nextLine();

        System.out.print("Digite a cidade de destino: ");
        String destino = teclado.nextLine();

        System.out.print("Digite a hora de partida (HH:MM): ");
        String horaString = teclado.nextLine();
        LocalTime horaPartida = LocalTime.parse(horaString);

        boolean vooEncontrado = false;
        Voo vooEscolhido = null;

        // Procurar o voo que corresponde aos critérios do usuário
        for (Voo voo : voos) {
            if (voo.getOrigem().equalsIgnoreCase(origem) && 
                voo.getDestino().equalsIgnoreCase(destino) &&
                voo.getHoraPartida().equals(horaPartida)) {
                vooEscolhido = voo;
                vooEncontrado = true;
                break;
            }
        }

        if (!vooEncontrado) {
            System.out.println("Nenhum voo encontrado com as especificações fornecidas.");
        } else {
            System.out.println("Voo encontrado:");
            System.out.println(vooEscolhido);

            System.out.print("Digite o número da fileira que deseja reservar: ");
            int fileira = teclado.nextInt() - 1;  // Subtrai 1 para ajustar ao índice 0 da matriz

            System.out.print("Digite o número do assento na fileira que deseja reservar: ");
            int assento = teclado.nextInt() - 1;  // Subtrai 1 para ajustar ao índice 0 da matriz

            // Verificar se o assento está disponível
            if (vooEscolhido.verificarDisponibilidade(fileira, assento)) {
                // Reservar o assento
                vooEscolhido.reservarAssento(fileira, assento);
                System.out.println("Assento reservado com sucesso!");
                System.out.println("Informações do voo:");
                System.out.println(vooEscolhido);
            } else {
                System.out.println("O assento escolhido já está reservado.");
            }

            // Mostrar os assentos disponíveis após a reserva
            vooEscolhido.mostrarAssentosDisponiveis();
        }
        teclado.close();
    }
}
