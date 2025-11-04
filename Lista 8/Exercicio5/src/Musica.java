class Musica extends Midia {
    private String album;
    private String produtora;
    private String produtor;
    private String compositores;

    // Construtor
    public Musica(String nome, String artistas, String genero, int anoLancamento,
                  String album, String produtora, String produtor, String compositores) {
        super(nome, artistas, genero, anoLancamento);
        this.album = album;
        this.produtora = produtora;
        this.produtor = produtor;
        this.compositores = compositores;
    }

    // Método toString para exibir detalhes da música
    @Override
    public String toString() {
        return super.toString() + //class o método de impressão na classe mãe
               "\nÁlbum: " + album +
               "\nProdutora: " + produtora +
               "\nProdutor: " + produtor +
               "\nCompositores: " + compositores;
    }
}