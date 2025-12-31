class Book {

    // Static variable
    static String libraryName = "Central City Library";

    // Instance variables
    String title;
    String author;
    final String isbn;   // final variable

    // Constructor using this keyword
    Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // Static method
    static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    // Method to display book details
    void displayDetails(Object obj) {
        if (obj instanceof Book) {
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("ISBN: " + isbn);
        } else {
            System.out.println("Invalid Book Object");
        }
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {

        Book book1 = new Book("Clean Code", "Robert C. Martin", "ISBN101");
        Book book2 = new Book("Effective Java", "Joshua Bloch", "ISBN102");

        Book.displayLibraryName();
        System.out.println();

        book1.displayDetails(book1);
        System.out.println();
        book2.displayDetails(book2);
    }
}