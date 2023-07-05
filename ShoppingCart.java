import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    private final Map<String, Integer> cart = new HashMap<>();
    private final Map<String, Double> itemsAndPrices;

    public ShoppingCart(Map<String, Double> itemsAndPrices) {
        this.itemsAndPrices = itemsAndPrices;
    }

    public void addItem(String item, int quantity) {
        if (itemsAndPrices.containsKey(item)) {
            cart.put(item, quantity);
        }
    }

    public void removeItem(String item) {
        cart.remove(item);
    }

    public void updateQuantity(String item, int quantity) {
        if (cart.containsKey(item)) {
            cart.put(item, quantity);
        }
    }

    public double calculateTotalPrice() {
        double total = 0.0;
        for (Map.Entry<String, Integer> entry : cart.entrySet()) {
            total += entry.getValue() * itemsAndPrices.get(entry.getKey());
        }
        return total;
    }
}