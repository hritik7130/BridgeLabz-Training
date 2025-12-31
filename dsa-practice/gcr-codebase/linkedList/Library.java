class Library {

    class Book {
        int id;
        String title, author, genre;
        boolean available;
        Book next, prev;
    }

    Book head, tail;

    void addBook(int id, String t, String a, String g) {
        Book b = new Book();
        b.id = id;
        b.title = t;
        b.author = a;
        b.genre = g;
        b.available = true;

        if (head == null) {
            head = tail = b;
        } else {
            tail.next = b;
            b.prev = tail;
            tail = b;
        }
    }
}
