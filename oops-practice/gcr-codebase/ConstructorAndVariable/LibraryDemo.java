public class LibraryDemo {

    public static void main(String[] args) {

        Book b = new Book("ISBN1234", "Java Basics");
        b.setAuthor("James Gosling");
        System.out.println("Author: " + b.getAuthor());

        System.out.println();

        EBook eb = new EBook("ISBN5678", "Advanced Java", "PDF");
        eb.displayEBookDetails();
    }
}


class Book {

    public String ISBN;         
    protected String title;   
    private String author;    

    Book(String ISBN, String title) {
        this.ISBN = ISBN;
        this.title = title;
    }

    // Setter for private variable
    public void setAuthor(String author) {
        this.author = author;
    }

    // Getter for private variable
    public String getAuthor() {
        return author;
    }
}

class EBook extends Book {

    String format;

    EBook(String ISBN, String title, String format) {
        super(ISBN, title);
        this.format = format;
    }

    void displayEBookDetails() {
        System.out.println("ISBN: " + ISBN);    
        System.out.println("Title: " + title);   
        System.out.println("Format: " + format);
    }
}