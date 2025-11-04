public class App {
    public static void main(String[] args) throws Exception {
        
        Frota frota = new Frota();

        // Adicionando vários veículos
        frota.adicionarVeiculo(new Carro("Chevrolet", "Onix", 2020, 4));
        frota.adicionarVeiculo(new Carro("Hyundai", "HB20", 2023, 4));
        frota.adicionarVeiculo(new Moto("Honda", "Biz", 2022, "Passeio"));
        frota.adicionarVeiculo(new Moto("Harley-Davidson", "Iron 883", 2022, "Cruiser"));

        // Exibindo detalhes da frota
        frota.exibirFrota();
    }
}
