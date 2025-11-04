class DVD extends ItemBiblioteca {
    private int duracao; // em minutos
    private String classificacaoEtaria;

    // Construtor
    public DVD(String titulo, int anoPublicacao, int duracao, String classificacaoEtaria) {
        super(titulo, anoPublicacao);
        this.duracao = duracao;
        this.classificacaoEtaria = classificacaoEtaria;
    }

    // Sobrescrita do método exibirDetalhes
    @Override
    public void exibirDetalhes() {
        System.out.println("DVD: " + titulo + " (" + anoPublicacao + ")");
        System.out.println("Duração: " + duracao + " minutos, Classificação: " + classificacaoEtaria);
    }
}