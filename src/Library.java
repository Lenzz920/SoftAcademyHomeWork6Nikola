public class Library {

    String name = "Unknown Library";
    Book[] libraryBooks = new Book[3];
    Customer[] customers = new Customer[2];

    public void addBookToLibrary(Book book) {
        for (int i = 0; i < libraryBooks.length; i++) {
            if (libraryBooks[i] == null) {
                libraryBooks[i] = book;
                break;
            } else {
                if (i == libraryBooks.length - 1) {
                    throw new RuntimeException("Library can't contain more than " + libraryBooks.length
                            + " books, you have reached the limit");
                }
            }
        }
    }

    public void addCustomerToLibrary(Customer customer) {
        for (int i = 0; i < customers.length; i++) {
            if (customers[i] == null) {
                customers[i] = customer;
                break;
            } else {
                if (i == libraryBooks.length - 1) {
                    throw new RuntimeException("Library can't contain more than " + customers.length
                            + " customers, you have reached the limit");
                }
            }
        }
    }

    public void searchForBookByName(String name) {
        for (int i = 0; i < libraryBooks.length; i++) {
            if (libraryBooks[i].getName().equals(name)) {
                System.out.println("The book is present at the library");
                break;
            } else {
                if (i == libraryBooks.length - 1) {
                    System.out.println("The book is not available");
                }
            }
        }
    }

}
