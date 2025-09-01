import javax.swing.JOptionPane;

public class App {
    private static boolean operacoesHabilitadas = false;
    public static void main(String[] args) throws Exception {
        Conta conta = null;

        while (true) {
            String menu = "=== Menu ===\n" +
                          "1. Criar conta\n" +
                          "2. Sacar\n" +
                          "3. Depositar\n" +
                          "4. Extrato\n" +
                          "5. Área do Gerente\n" +
                          "6. Sair\n" +
                          "Escolha uma opção: ";
            String opcao = JOptionPane.showInputDialog(menu);

            if (opcao == null) {
                break; // Usuário clicou em "Cancelar"
            }

            switch (opcao) {
                case "1":
                    if (!operacoesHabilitadas) {
                        JOptionPane.showMessageDialog(null, "Operações bancárias estão desabilitadas.");
                        break;
                    }
                    String nome = JOptionPane.showInputDialog("Nome:");
                    String cpf = JOptionPane.showInputDialog("CPF:");
                    String endereco = JOptionPane.showInputDialog("Endereço:");
                    String eMail = JOptionPane.showInputDialog("eMail:");
                    Proprietario proprietario = new Proprietario(nome, cpf, endereco, eMail);
                    double saldoInicial = Double.parseDouble(JOptionPane.showInputDialog("Saldo inicial:"));
                    conta = new Conta(proprietario, saldoInicial);
                    JOptionPane.showMessageDialog(null, "Conta criada com sucesso!");
                    break;

                case "2":
                    if (!operacoesHabilitadas) {
                        JOptionPane.showMessageDialog(null, "Operações bancárias estão desabilitadas.");
                        break;
                    }
                    if (conta != null) {
                        double valorSaque = Double.parseDouble(JOptionPane.showInputDialog("Valor a sacar:"));
                        JOptionPane.showMessageDialog(null, conta.sacar(valorSaque));
                    } else {
                        JOptionPane.showMessageDialog(null, "Nenhuma conta criada.");
                    }
                    break;

                case "3":
                    if (!operacoesHabilitadas) {
                        JOptionPane.showMessageDialog(null, "Operações bancárias estão desabilitadas.");
                        break;
                    }
                    if (conta != null) {
                        double valorDeposito = Double.parseDouble(JOptionPane.showInputDialog("Valor a depositar:"));
                        JOptionPane.showMessageDialog(null, conta.depositar(valorDeposito));
                    } else {
                        JOptionPane.showMessageDialog(null, "Nenhuma conta criada.");
                    }
                    break;

                case "4":
                    if (!operacoesHabilitadas) {
                        JOptionPane.showMessageDialog(null, "Operações bancárias estão desabilitadas.");
                        break;
                    }
                    if (conta != null) {
                        JOptionPane.showMessageDialog(null, conta.extrato());
                    } else {
                        JOptionPane.showMessageDialog(null, "Nenhuma conta criada.");
                    }
                    break;

                case "5":
                    String senha = JOptionPane.showInputDialog("Digite a senha do gerente:");
                    if ("gerente123".equals(senha)) {
                        operacoesHabilitadas = !operacoesHabilitadas;
                        String status = operacoesHabilitadas ? "habilitadas" : "desabilitadas";
                        JOptionPane.showMessageDialog(null, "Operações bancárias " + status + ".");
                    } else {
                        JOptionPane.showMessageDialog(null, "Senha incorreta.");
                    }
                    break;

                case "6":
                    JOptionPane.showMessageDialog(null, "Saindo...");
                    System.exit(0);

                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida.");
            }

            int resposta = JOptionPane.showConfirmDialog(null, "Deseja realizar outra operação?", "Continuar", JOptionPane.YES_NO_OPTION);
            if (resposta == JOptionPane.NO_OPTION) {
                break;
            }
        }
    }
}

