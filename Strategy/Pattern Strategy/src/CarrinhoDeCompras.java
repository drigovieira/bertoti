public class CarrinhoDeCompras {
    private FreteStrategy freteStrategy;

    public void setFreteStrategy(FreteStrategy freteStrategy) {
        this.freteStrategy = freteStrategy;
    }

    public double calcularFrete(double peso) {
        return freteStrategy.calcular(peso);
    }
}
