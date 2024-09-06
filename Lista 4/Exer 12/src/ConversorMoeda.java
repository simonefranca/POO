public class ConversorMoeda {
    // Taxas de câmbio
    private static final double TAXA_DOLAR = 5.57;
    private static final double TAXA_EURO = 6.18;

    public static double realParaDolar(double real) {
        return real / TAXA_DOLAR;
    }

    public static double dolarParaReal(double dolar) {
        return dolar * TAXA_DOLAR;
    }

    public static double realParaEuro(double real) {
        return real / TAXA_EURO;
    }

    public static double euroParaReal(double euro) {
        return euro * TAXA_EURO;
    }
}
