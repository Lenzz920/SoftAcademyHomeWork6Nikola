import java.math.BigDecimal;

public class Customer {

    private String name;
    private int age;
    private BigDecimal money = BigDecimal.valueOf(1);
    private Book[] customerBooks = new Book[2];

    public Customer(String name, int age, BigDecimal money) {
        setName(name);
        setAge(age);
        this.money = money;
    }

    private void setName(String name) {
        if (name.length() < 2) {
            throw new RuntimeException("The name of the customer can't have less than 2 characters");
        } else {
            this.name = name;
        }
    }

    private void setAge(int age) {
        if (age < 7) {
            throw new RuntimeException("The customer should be at least 7 years old");
        } else {
            this.age = age;
        }
    }

    public void addRentedBook(Book book) {
        if(money.compareTo(book.getPrice()) >= 0) {
            for (int i = 0; i < customerBooks.length; i++) {
                if (customerBooks[i] == null) {
                    customerBooks[i] = book;
                    break;
                } else {
                    if (i == customerBooks.length) {
                        throw new RuntimeException("Customer has already rented " + customerBooks.length
                                + " books, you have reached the limit");
                    }
                }
            }
        } else System.out.println("You don't have enough money to buy this book");
    }

    public void printRentedBooks() {
        for(int i = 0; i < customerBooks.length; i++) {
            if(customerBooks[i] != null) {
                System.out.println(customerBooks[i].getName());
            }
        }
    }

}