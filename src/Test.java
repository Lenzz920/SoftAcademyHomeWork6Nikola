import java.math.BigDecimal;

public class Test {

    public static void main(String[] args) {

        Library library = new Library();


        Customer customerA = new Customer("John", 15, BigDecimal.valueOf(75));
        Customer customerB = new Customer("Bob", 8, BigDecimal.valueOf(10));
        Customer customerC = new Customer("Lemmy", 23, BigDecimal.valueOf(20));
        Customer customerD = new Customer("Maria", 41, BigDecimal.valueOf(150));
        Customer customerE = new Customer("Anna", 52, BigDecimal.valueOf(250));

        Book a = new Book("Harry Potter", "J. K. Rowling", "0000001", BigDecimal.valueOf(12.99));
        Book b = new Book("1984", "George Orwell", "0000002", BigDecimal.valueOf(20.99));
        Book c = new Book("The Great Gatsby", "F. Scott Fitzgerald", "0000003", BigDecimal.valueOf(9.99));
        Book d = new Book("The Hunger Games", "Suzanne Collins", "0000004", BigDecimal.valueOf(34.99));
        Book e = new Book("The Book Thief", "Markus Zusak", "0000005", BigDecimal.valueOf(47.99));

        library.addBookToLibrary(a);
        library.addBookToLibrary(b);
        library.addBookToLibrary(c);

        customerA.addRentedBook(a);
        customerA.addRentedBook(b);
        customerA.printRentedBooks();

        library.searchForBookByName("The Book Thief");
    }

}
