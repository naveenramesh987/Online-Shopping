import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("John Doe", "johndoe@email.com");
        Product product1 = new Product("Product 1", "Description of product 1",
                10.99, "image1.jpg", 4);
        Product product2 = new Product("Product 2", "Description of product 2",
                19.99, "image2.jpg", 7);
        Cart cart = new Cart(new ArrayList<>(Arrays.asList(product1, product2)));

        Order order = new Order(12345, LocalDate.now(), "John Doe",
                "johndoe@example.com", "123 Main St., Anytown USA",
                new ArrayList<>(Arrays.asList(product1, product2)));

        Payment payment = new Payment("credit card", cart.calculateTotalPrice(),
                LocalDate.now());

        Wishlist wishlist = new Wishlist();
        wishlist.addProduct(product1);

        Review review = new Review(1, customer, product1, "Great product!",
                LocalDate.now(), 5);

        Notification notification = new Notification("Status", "Your order has shipped!");

        System.out.println("Customer: " + customer.getName());
        System.out.println("Products:");
        System.out.println("- " + product1.getName());
        System.out.println("- " + product2.getName());
        System.out.println("Cart total price: " + cart.calculateTotalPrice());
        System.out.println("Payment amount: " + payment.getAmount());
        System.out.println("Wishlist contents: " + wishlist.getProducts());
        System.out.println("Review content: " + review.getContent());
        System.out.println("Notification message: " + notification.getMessage());
    }
}