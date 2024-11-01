class Midia {
    protected String nome;
    protected String artistas;
    protected String genero;
    protected int anoLancamento;

    // Construtor
    public Midia(String nome, String artistas, String genero, int anoLancamento) {
        this.nome = nome;
        this.artistas = artistas;
        this.genero = genero;
        this.anoLancamento = anoLancamento;
    }

    // Método toString para exibir detalhes da mídia
    @Override
    public String toString() {
        return "Nome: " + nome +
               "\nArtistas: " + artistas +
               "\nGênero: " + genero +
               "\nAno de Lançamento: " + anoLancamento;
    }
}