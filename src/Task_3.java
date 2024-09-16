import java.util.HashMap;

public class Task_3 {
    public static void main(String[] args) {
        ShoppingBasket.addProduct("milk", 2);
        ShoppingBasket.addProduct("tea", 1);
        ShoppingBasket.addProduct("bread", 3);
        ShoppingBasket.addProduct("juice", 2);
        ShoppingBasket.showBasket();
        ShoppingBasket.addProduct("tea", 2);
        ShoppingBasket.showBasket();
        ShoppingBasket.removeProduct("juice");
        ShoppingBasket.showBasket();
        ShoppingBasket.updateQuantity("milk", 1);
        ShoppingBasket.showBasket();
        ShoppingBasket.checkProduct("tea");
        ShoppingBasket.showBasket();



    }

    public static class ShoppingBasket {
        private static HashMap<String, Integer> basket = new HashMap<>();

        public static void addProduct(String product, Integer quantity) {
            if (basket.containsKey(product)) {
                basket.put(product, basket.get(product) + quantity);
            } else {
                basket.put(product, quantity);
            }
        }

        public static void removeProduct(String product) {
            basket.remove(product);
        }

        public static void updateQuantity(String product, Integer quantity) {
            if (basket.containsKey(product)) {
                basket.put(product, quantity);
            }

        }

        public static int checkProduct(String product) {
            System.out.println(basket.getOrDefault(product, 0));

            return 0;
        }
        public static void showBasket() {
            System.out.println(basket);

        }

    }
}
