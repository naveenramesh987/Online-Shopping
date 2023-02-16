import java.time.LocalDate;
import java.util.ArrayList;

public class Order {
    private int orderId;
    private LocalDate orderDate;
    private String customerName;
    private String customerEmail;
    private String shippingAddress;
    private ArrayList<Product> products;
    private Cart cart;

    public Order(int orderId, LocalDate orderDate, String customerName, String customerEmail,
                 String shippingAddress, ArrayList<Product> products) {
        this.orderId = orderId;
        this.orderDate = orderDate;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.shippingAddress = shippingAddress;
        this.products = products;
        this.cart = cart;
    }

    public int getOrderId() {
        return orderId;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public String getShippingAddress() {
        return shippingAddress;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

}