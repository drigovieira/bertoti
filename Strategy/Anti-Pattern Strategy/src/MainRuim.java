public class MainRuim {
    public static void main(String[] args) {
        CarrinhoDeComprasRuim carrinho = new CarrinhoDeComprasRuim();
        double peso = 2.5;

        System.out.println("Frete Sedex: R$" + carrinho.calcularFrete("Sedex", peso));
        System.out.println("Frete Normal: R$" + carrinho.calcularFrete("Normal", peso));
    }
}