// Superclass: Book
class Book {
    String title;
    int publicationYear;

    // Constructor to initialize book details
    Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }

    // Method to display book information
    void displayInfo() {
        System.out.println("Book Title: " + title);
        System.out.println("Publication Year: " + publicationYear);
    }
}

// Subclass: Author (extends Book)
class Author extends Book {
    String name;
    String bio;

    // Constructor to initialize both book and author details
    Author(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear); // calling parent constructor
        this.name = name;
        this.bio = bio;
    }

    // Overriding displayInfo method
    void displayInfo() {
        super.displayInfo(); // display book details
        System.out.println("Author Name: " + name);
        System.out.println("Author Bio: " + bio);
    }
}

public class LibrarySystem {
    public static void main(String[] args) {

        Author book1 = new Author(
                "Clean Code",
                2008,
                "Robert C. Martin",
                "Expert in software craftsmanship"
        );

        book1.displayInfo();
    }
}