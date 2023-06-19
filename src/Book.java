import java.math.BigDecimal;

public class Book {

    private String name;
    private String author;
    private String serialNumber;
    private BigDecimal price = BigDecimal.valueOf(0);

    public Book(String name, String author, String serialNumber, BigDecimal price) {
        setName(name);
        setAuthor(author);
        this.serialNumber = serialNumber;
        this.price = price;
    }

    private void setName(String name) {
        if(name.length() < 2) {
            throw new RuntimeException("The name of the book can't be less than 2 characters");
        } else {
            this.name = name;
        }
    }

    private void setAuthor(String author) {
        if(author.length() < 7) {
            throw new RuntimeException("The author of the book can't be less than 7 characters");
        } else {
            this.author = author;
        }
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

}
