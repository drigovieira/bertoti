public class Main {
    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        double peso = 2.5; // 2.5 kg

        // Sedex
        carrinho.setFreteStrategy(new Sedex());
        System.out.println("Frete Sedex: R$" + carrinho.calcularFrete(peso));

        // Normal
        carrinho.setFreteStrategy(new Normal());
        System.out.println("Frete Normal: R$" + carrinho.calcularFrete(peso));
    }
}