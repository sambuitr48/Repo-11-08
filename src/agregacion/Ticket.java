package agregacion;

public class Ticket {
    private String ticketNumber;
    private String date;
    Product product;

    public Ticket(String ticketNumber, String date, Product product) {
        this.ticketNumber = ticketNumber;
        this.date = date;
        this.product = product;
    }
}
