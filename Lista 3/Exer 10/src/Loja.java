import automotivo.Pneu;
import automotivo.ProdutoLimpeza;
import bijouteria.Anel;
import bijouteria.Brinco;
import eletronicos.Celular;
import eletronicos.TV;

public class Loja {
    public static void main(String[] args) throws Exception {
        // Instanciando objetos das classes
        Celular celular = new Celular("Samsung", "Galaxy S21", 8, 128);
        TV tv = new TV("LG", "OLED55", 55);
        Anel anel = new Anel("Ouro", 2.5, 18.0);
        Brinco brinco = new Brinco("Brinco de Pérola", "Prata", 3.0);
        Pneu pneu = new Pneu("Michelin", 17);
        ProdutoLimpeza produtoLimpeza = new ProdutoLimpeza("Cera", "3M", 500);

        // Exibindo as descrições dos produtos
        System.out.println(celular.toString());
        System.out.println(tv.toString());
        System.out.println(anel.toString());
        System.out.println(brinco.toString());
        System.out.println(pneu.toString());
        System.out.println(produtoLimpeza.toString());
    }
}
