public class ItemIndividual implements MenuItem {
    private String nome;
    private double preco;

    public ItemIndividual(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public double getPreco() {
        return preco;
    }
}
