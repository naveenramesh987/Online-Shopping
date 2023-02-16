import java.util.ArrayList;

public class Cart {
    private ArrayList<Product> products;

    public Cart(ArrayList<Product> products) {
        this.products = new ArrayList<Product>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public void updateQuantity(Product product, int quantity) {
        product.setQuantity(quantity);
    }

    public double calculateTotalPrice() {
        double totalPrice = 0.0;
        for (Product product : products) {
            totalPrice += product.getPrice() * product.getQuantity();
        }
        return totalPrice;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }
}