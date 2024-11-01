public class App {
    public static void main(String[] args) throws Exception {
      
        Biblioteca biblioteca = new Biblioteca();

        // Adicionando diferentes tipos de itens
        biblioteca.adicionarItem(new Livro("O Senhor dos Anéis", 1954, "J.R.R. Tolkien", 1216));
        biblioteca.adicionarItem(new Revista("Revista Capricho", 2023, "Sociedade Brasileira de Bobagens", 254));
        biblioteca.adicionarItem(new DVD("A História da Matemática", 2000, 136, "Sem classificação"));

        // Exibindo detalhes dos itens da biblioteca
        biblioteca.exibirItens();
    }
}
