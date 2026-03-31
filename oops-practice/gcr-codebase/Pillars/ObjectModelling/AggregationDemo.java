import java.util.ArrayList;

// Book class (can exist independently)
class Book {
    String title;
    String author;

    // Constructor to initialize book details
    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Method to display book details
    void displayBook() {
        System.out.println("Title: " + title + ", Author: " + author);
    }
}

// Library class (aggregates Book objects)
class Library {
    String libraryName;
    ArrayList<Book> books;  // Library HAS books

    // Constructor to initialize library
    Library(String libraryName) {
        this.libraryName = libraryName;
        books = new ArrayList<>();
    }

    // Method to add books to library
    void addBook(Book book) {
        books.add(book);
    }

    // Method to display all books in the library
    void displayLibraryBooks() {
        System.out.println("Library: " + libraryName);
        for (Book book : books) {
            book.displayBook();
        }
    }
}

public class AggregationDemo {
    public static void main(String[] args) {

        // Creating books independently
        Book b1 = new Book("Clean Code", "Robert Martin");
        Book b2 = new Book("Effective Java", "Joshua Bloch");

        // Creating libraries
        Library lib1 = new Library("City Library");
        Library lib2 = new Library("College Library");

        // Adding books to different libraries
        lib1.addBook(b1);
        lib1.addBook(b2);

        lib2.addBook(b2);  // Same book added to another library

        lib1.displayLibraryBooks();
        System.out.println();
        lib2.displayLibraryBooks();
    }
}