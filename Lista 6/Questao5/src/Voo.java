import java.time.LocalTime;

public class Voo {
    private String origem;
    private String destino;
    private LocalTime horaPartida;
    private boolean[][] assentosDisponiveis;
    private Aeronave aeronave;

    // Construtor
    public Voo(String origem, String destino, LocalTime horaPartida, Aeronave aeronave) {
        this.origem = origem;
        this.destino = destino;
        this.horaPartida = horaPartida;
        this.aeronave = aeronave;
        this.assentosDisponiveis = new boolean[aeronave.getNumeroFileiras()][aeronave.getNumeroAssentosPorFileira()];
        
        // Inicializa todos os assentos como disponíveis (true)
        for (int i = 0; i < assentosDisponiveis.length; i++) {
            for (int j = 0; j < assentosDisponiveis[i].length; j++) {
                assentosDisponiveis[i][j] = true;
            }
        }
    }

    // Getters
    public String getOrigem() {
        return origem;
    }

    public String getDestino() {
        return destino;
    }

    public LocalTime getHoraPartida() {
        return horaPartida;
    }

    public boolean[][] getAssentosDisponiveis() {
        return assentosDisponiveis;
    }

    public Aeronave getAeronave() {
        return aeronave;
    }

    // Método para verificar se um assento está disponível
    public boolean verificarDisponibilidade(int fileira, int assento) {
        return assentosDisponiveis[fileira][assento];
    }

    // Método para reservar um assento
    public void reservarAssento(int fileira, int assento) {
        assentosDisponiveis[fileira][assento] = false;
    }

    // Método para imprimir as informações do voo
    @Override
    public String toString() {
        return "Origem: " + origem + ", Destino: " + destino + 
               ", Hora de Partida: " + horaPartida + 
               ", Aeronave: " + aeronave.toString();
    }

    // Método para imprimir os assentos disponíveis
    public void mostrarAssentosDisponiveis() {
        System.out.println("Assentos disponíveis: (true = disponível, false = reservado)");
        for (int i = 0; i < assentosDisponiveis.length; i++) {
            for (int j = 0; j < assentosDisponiveis[i].length; j++) {
                System.out.print(assentosDisponiveis[i][j] + " ");
            }
            System.out.println();
        }
    }
}
