import java.time.LocalDate;

public class Review {
    private int id;
    private Customer customer;
    private Product product;
    private String content;
    private LocalDate date;
    private int rating;

    public Review(int reviewId, Customer customer, Product product, String content, LocalDate date, int rating) {
        this.id = reviewId;
        this.customer = customer;
        this.product = product;
        this.content = content;
        this.date = date;
        this.rating = rating;
    }

    public int getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public String getContent() {
        return content;
    }

    public Product getProduct() {
        return product;
    }
}