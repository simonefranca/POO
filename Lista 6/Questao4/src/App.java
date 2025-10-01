import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
         Scanner teclado = new Scanner(System.in);
        Aluno[] alunos = new Aluno[5];
        double mediaGeral = 0;

        // Inserindo dados dos alunos
        for (int i = 0; i < alunos.length; i++) {
            System.out.println("Digite o nome do aluno " + (i + 1) + ":");
            String nome = teclado.nextLine();

            System.out.println("Digite a nota da P1:");
            double nota1 = teclado.nextDouble();

            System.out.println("Digite a nota da P2:");
            double nota2 = teclado.nextDouble();

            System.out.println("Digite a nota da P3:");
            double nota3 = teclado.nextDouble();

            // Limpar buffer do scanner
            teclado.nextLine();

            // Criar objeto Aluno e associar ao vetor
            alunos[i] = new Aluno(nome, nota1, nota2, nota3);
        }

        // Exibir dados e calcular média geral
        System.out.println("\nDados dos alunos:");
        for (Aluno aluno : alunos) {
            System.out.println("Nome: " + aluno.getNome());
            double[] notas = aluno.getNotas();
            System.out.println("Nota P1: " + notas[0]);
            System.out.println("Nota P2: " + notas[1]);
            System.out.println("Nota P3: " + notas[2]);
            double media = aluno.calcularMedia();
            System.out.println("Média: " + media);
            System.out.println("--------------------------");
            mediaGeral += media;
        }

        // Média geral de todos os alunos
        mediaGeral /= alunos.length;
        System.out.println("Média geral de todos os alunos: " + mediaGeral);

        teclado.close();
    }
}
