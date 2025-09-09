public class Produto {
    private String codigo;
    private double valor;
    private String descricao;

    public Produto(String codigo, double valor, String descricao) {
        this.codigo = codigo;
        this.valor = valor;
        this.descricao = descricao;
    }

    public String getCodigo() {
        return codigo;
    }

    public double getValor() {
        return valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void exibirProduto() {
        System.out.println("Código: " + codigo);
        System.out.println("Valor: R$" + valor);
        System.out.println("Descrição: " + descricao);
    }
}
