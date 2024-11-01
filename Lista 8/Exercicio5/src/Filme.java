class Filme extends Midia {
    private String estudio;
    private String direcao;

    // Construtor
    public Filme(String nome, String artistas, String genero, int anoLancamento,
                 String estudio, String direcao) {
        super(nome, artistas, genero, anoLancamento);
        this.estudio = estudio;
        this.direcao = direcao;
    }

    // Método toString para exibir detalhes do filme
    @Override
    public String toString() {
        return super.toString() + //class o método de impressão na classe mãe
               "\nEstúdio: " + estudio +
               "\nDireção: " + direcao;
    }
}