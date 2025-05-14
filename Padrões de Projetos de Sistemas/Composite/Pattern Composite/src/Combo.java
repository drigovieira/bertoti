import java.util.ArrayList;
import java.util.List;

public class Combo implements MenuItem {
    private List<MenuItem> itens = new ArrayList<>();

    public void add(MenuItem item) {
        itens.add(item);
    }

    @Override
    public double getPreco() {
        double total = 0;
        for (MenuItem item : itens) {
            total += item.getPreco();
        }
        return total * 0.9; // 10% de desconto no combo
    }
}
