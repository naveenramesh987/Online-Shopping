public class Notification {
    private String title;
    private String message;
    private long timestamp;

    public Notification(String title, String message) {
        this.title = title;
        this.message = message;
        this.timestamp = System.currentTimeMillis();
    }

    public String getTitle() {
        return title;
    }

    public String getMessage() {
        return message;
    }

    public long getTimestamp() {
        return timestamp;
    }
}