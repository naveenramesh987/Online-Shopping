import java.util.ArrayList;

public class Wishlist {
    private ArrayList<Product> products;

    public Wishlist() {
        products = new ArrayList<Product>();
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public boolean hasProduct(Product product) {
        return products.contains(product);
    }
}