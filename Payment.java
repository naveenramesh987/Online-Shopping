import java.time.LocalDate;

public class Payment {
    private String method;
    private double amount;
    private LocalDate date;

    public Payment(String paymentMethod, double paymentAmount, LocalDate paymentDate) {
        this.method = paymentMethod;
        this.amount = paymentAmount;
        this.date = paymentDate;
    }

    public String getMethod() {
        return method;
    }

    public double getAmount() {
        return amount;
    }

    public LocalDate getDate() {
        return date;
    }

}