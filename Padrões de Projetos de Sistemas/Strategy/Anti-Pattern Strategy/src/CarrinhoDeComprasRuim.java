public class CarrinhoDeComprasRuim {
    public double calcularFrete(String tipo, double peso) {
        if ("Sedex".equals(tipo)) {
            return peso * 10.0;
        } else if ("Normal".equals(tipo)) {
            return peso * 5.0;
        } else if ("Expresso".equals(tipo)) {
            return peso * 15.0;
        }
        throw new IllegalArgumentException("Tipo de frete inválido!");
    }
}
