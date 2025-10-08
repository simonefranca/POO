import java.util.ArrayList;
import java.util.Scanner;

public class App {
    private static ArrayList<Musicas> bibliotecaMusicas = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        int opcao;
        do {
            System.out.println("\n1. Cadastrar música");
            System.out.println("2. Listar todas as músicas");
            System.out.println("3. Procurar música");
            System.out.println("4. Remover música");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir nova linha

            switch (opcao) {
                case 1:
                    cadastrarMusica();
                    break;
                case 2:
                    listarMusicas();
                    break;
                case 3:
                    procurarMusica();
                    break;
                case 4:
                    removerMusica();
                    break;
                case 5:
                    System.out.println("Encerrando o Programa...");
                    break;
                default:
                    System.out.println("Opção inválida!  Digite novamente.");
            }
        } while (opcao != 5);
    }
    // Método para cadastrar uma nova música
    private static void cadastrarMusica() {
        System.out.print("Digite o título da música: ");
        String titulo = scanner.nextLine();
        System.out.print("Digite o nome do artista: ");
        String artista = scanner.nextLine();
        System.out.print("Digite o gênero da música: ");
        String genero = scanner.nextLine();

        Musicas novaMusica = new Musicas(titulo, artista, genero);
        bibliotecaMusicas.add(novaMusica);
        System.out.println("Música cadastrada com sucesso!");
    }

    // Método para listar todas as músicas
    private static void listarMusicas() {
        if (bibliotecaMusicas.isEmpty()) {
            System.out.println("Não há músicas cadastradas.");
        } else {
            System.out.println("\nLista de músicas:");
            for (Musicas musica : bibliotecaMusicas) { //usando o for aprimorado
                System.out.println(musica);
            }
        }
    }

    // Método para procurar uma música por título, artista ou gênero
    private static void procurarMusica() {
        System.out.print("Digite o título, artista ou gênero da música que deseja buscar: ");
        String termoBusca = scanner.nextLine();
        boolean encontrou = false;

        for (Musicas musica : bibliotecaMusicas) {
            if (musica.getTitulo().toLowerCase().contains(termoBusca.toLowerCase()) ||
                musica.getArtista().toLowerCase().contains(termoBusca.toLowerCase()) ||
                musica.getGenero().toLowerCase().contains(termoBusca.toLowerCase())) {
                System.out.println(musica);
                encontrou = true;
            }
        }

        if (!encontrou) {
            System.out.println("Nenhuma música encontrada com o termo de busca fornecido.");
        }
    }

    // Método para remover uma música por título, artista ou gênero
    private static void removerMusica() {
        System.out.print("Digite o título, artista ou gênero da música que deseja remover: ");
        String termoRemover = scanner.nextLine();
        boolean removeu = false;

        for (int i = 0; i < bibliotecaMusicas.size(); i++) {
            Musicas musica = bibliotecaMusicas.get(i);
            if (musica.getTitulo().toLowerCase().contains(termoRemover.toLowerCase()) ||
                musica.getArtista().toLowerCase().contains(termoRemover.toLowerCase()) ||
                musica.getGenero().toLowerCase().contains(termoRemover.toLowerCase())) {
                bibliotecaMusicas.remove(i);
                System.out.println("Música removida: " + musica);
                removeu = true;
                break; // Remove apenas a primeira música correspondente
            }
        }

        if (!removeu) {
            System.out.println("Nenhuma música encontrada com o termo fornecido para remoção.");
        }
    }
}
