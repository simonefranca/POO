import javax.swing.JOptionPane;
public class App {
    public static void main(String[] args) throws Exception {
        //JOptionPane.showMessageDialog(null, "Hello, World!");
        //JOptionPane.showMessageDialog(null, "Deu Ruim", "Programa de Teste", JOptionPane.ERROR_MESSAGE);
        //String nome = JOptionPane.showInputDialog(null, "Digite seu nome: ", "Testando o ShowDialog", JOptionPane.INFORMATION_MESSAGE);
        //JOptionPane.showMessageDialog(null, "Bem Vindo " + nome);

        int opcao = JOptionPane.showConfirmDialog(null, "Deseja sair sem salvar o arquivo?", "Testando a caixa de Confirmação", JOptionPane.OK_CANCEL_OPTION);

        switch (opcao) {
            case JOptionPane.CANCEL_OPTION:
                System.out.println("O usuário cancelou!");
                break;
            case JOptionPane.YES_OPTION:
                System.out.println("O usuário confirmou!");
                break;
            case JOptionPane.NO_OPTION:
                System.out.println("O usuário não deseja sair sem salvar!");
                break;
            default:
                break;
        }
    }
}
