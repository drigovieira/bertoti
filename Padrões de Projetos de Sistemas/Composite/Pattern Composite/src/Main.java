// Uso
public class Main {
    public static void main(String[] args) {
        ItemIndividual hamburguer = new ItemIndividual("Hambúrguer", 20.0);
        ItemIndividual batata = new ItemIndividual("Batata Frita", 8.0);
        ItemIndividual refrigerante = new ItemIndividual("Refrigerante", 5.0);

        Combo combo = new Combo();
        combo.add(hamburguer);
        combo.add(batata);
        combo.add(refrigerante);

        System.out.println("Preço do combo: R$" + combo.getPreco()); // R$29.7 (com desconto)
    }
}