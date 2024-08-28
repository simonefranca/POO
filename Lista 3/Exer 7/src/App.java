import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        // Leitura dos dados da primeira pessoa
        System.out.print("Digite o nome da primeira pessoa: ");
        String nome1 = teclado.nextLine();

        System.out.print("Digite a idade da primeira pessoa: ");
        int idade1 = teclado.nextInt();

        System.out.print("Digite a frequência cardíaca da primeira pessoa: ");
        int frequenciaCardiaca1 = teclado.nextInt();
        teclado.nextLine();  // Consumir a quebra de linha

        Pessoa pessoa1 = new Pessoa(nome1, idade1, frequenciaCardiaca1);

        // Leitura dos dados da segunda pessoa
        System.out.print("Digite o nome da segunda pessoa: ");
        String nome2 = teclado.nextLine();

        System.out.print("Digite a idade da segunda pessoa: ");
        int idade2 = teclado.nextInt();

        System.out.print("Digite a frequência cardíaca da segunda pessoa: ");
        int frequenciaCardiaca2 = teclado.nextInt();

        Pessoa pessoa2 = new Pessoa(nome2, idade2, frequenciaCardiaca2);

        // Verifica e imprimi se a frequência cardíaca das pessoas está acima do limite
        System.out.println("\nVerificação das pessoas:");
        verificarFrequenciaCardiaca(pessoa1);
        verificarFrequenciaCardiaca(pessoa2);

        // Determina e imprimi quem tem a maior frequência cardíaca
        String nomeMaiorFrequencia = compararFrequenciaCardiaca(pessoa1, pessoa2);

        System.out.println("\nA pessoa com a maior frequência cardíaca é: " + nomeMaiorFrequencia);

        teclado.close();
    }
    //Métodos estáticos
    public static void verificarFrequenciaCardiaca(Pessoa pessoa) {
        //Mostra os dados da pessoa
        System.out.println("Dados da pessoa: " + pessoa.getNome() + ", Idade: " + pessoa.getIdade() +
                ", Frequência Cardíaca: " + pessoa.getFrequenciaCardiaca());

        //Aciona o método que verifica se a frequência cardiaca está acima do limite
        if (pessoa.isFrequenciaCardiacaAcimaDoLimite()) {
            System.out.println("A frequência cardíaca está acima do limite permitido!");
        } else {
            System.out.println("A frequência cardíaca está dentro do limite permitido.");
        }
    }
    public static String compararFrequenciaCardiaca(Pessoa pessoa1, Pessoa pessoa2) {
        if (pessoa1.getFrequenciaCardiaca() > pessoa2.getFrequenciaCardiaca()) {
            return pessoa1.getNome();
        } else {
            return pessoa2.getNome();
        }
    }
}
