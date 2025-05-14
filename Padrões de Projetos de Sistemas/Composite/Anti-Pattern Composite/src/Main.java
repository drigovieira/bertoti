public class Main {
    public static void main(String[] args) {
        ItemIndividual hamburguer = new ItemIndividual("Hambúrguer", 20.0);
        ItemIndividual batata = new ItemIndividual("Batata", 8.0);
        ItemIndividual refrigerante = new ItemIndividual("Refrigerante", 5.0);

        // Anti-Pattern: Combo só funciona com 3 itens fixos
        ComboRuim combo = new ComboRuim(hamburguer, batata, refrigerante);
        System.out.println("Preço do combo (Anti-Pattern): R$" + combo.getPreco());

        // Problema 3: Não aceita novos itens sem modificação
        // combo.adicionar(new ItemIndividual("Sobremesa", 6.0)); // Não compila!
    }
}