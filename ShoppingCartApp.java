import java.util.HashMap;
import java.util.Map;

public class ShoppingCartApp {
    public static void main(String[] args) {
        System.out.println("Starting shopping cart app");
        Map<String, Double> itemsAndPrices = new HashMap<>();
        itemsAndPrices.put("Book", 15.99);
        itemsAndPrices.put("Pen", 0.99);
        itemsAndPrices.put("Notebook", 5.99);

        ShoppingCart cart = new ShoppingCart(itemsAndPrices);
        cart.addItem("Book", 2);
        cart.addItem("Pen", 10);
        cart.updateQuantity("Pen", 20);
        cart.addItem("Notebook", 1);
        cart.removeItem("Book");

        double total = cart.calculateTotalPrice();
        System.out.println("Total price: " + total);
    }
}
