public class ComboRuim {
    private ItemIndividual hamburguer;
    private ItemIndividual batata;
    private ItemIndividual bebida;

    public ComboRuim(ItemIndividual h, ItemIndividual b, ItemIndividual beb) {
        this.hamburguer = h;
        this.batata = b;
        this.bebida = beb;
    }

    // Problema 1: Novo item exige modificar a classe
    public void adicionarSobremesa(ItemIndividual sobremesa) {
        // Lógica complexa para adaptar
    }

    // Problema 2: Cálculo hardcoded para 3 itens
    public double getPreco() {
        return (hamburguer.getPreco() + batata.getPreco() + bebida.getPreco()) * 0.9;
    }
}
