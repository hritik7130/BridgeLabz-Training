class TicketSystem {

    class Ticket {
        int id;
        String name, movie;
        Ticket next;
    }

    Ticket head;

    void addTicket(int id, String name, String movie) {
        Ticket t = new Ticket();
        t.id = id;
        t.name = name;
        t.movie = movie;

        if (head == null) {
            head = t;
            t.next = head;
            return;
        }

        Ticket temp = head;
        while (temp.next != head)
            temp = temp.next;

        temp.next = t;
        t.next = head;
    }
}
