package bt8;

public class Card extends Student {
    private String id;
    private int borrowDate;
    private int paymentDate;
    private int bookId;

    public Card() {
    }

    public Card(String id, int borrowDate, int paymentDate, int bookId) {
        this.id = id;
        this.borrowDate = borrowDate;
        this.paymentDate = paymentDate;
        this.bookId = bookId;
    }

    public Card(String name, int age, String myClass, String id, int borrowDate, int paymentDate, int bookId) {
        super(name, age, myClass);
        this.id = id;
        this.borrowDate = borrowDate;
        this.paymentDate = paymentDate;
        this.bookId = bookId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getBorrowDate() {
        return borrowDate;
    }

    public void setBorrowDate(int borrowDate) {
        this.borrowDate = borrowDate;
    }

    public int getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(int paymentDate) {
        this.paymentDate = paymentDate;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    @Override
    public String toString() {
        return "Card{" +
                "id='" + id + '\'' +
                ", borrowDate=" + borrowDate +
                ", paymentDate=" + paymentDate +
                ", bookId=" + bookId +
                '}';
    }
}
