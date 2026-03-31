class RoundRobin {

    class Process {
        int pid, burst;
        Process next;

        Process(int p, int b) {
            pid = p;
            burst = b;
        }
    }

    Process head;

    void addProcess(int id, int burst) {
        Process p = new Process(id, burst);

        if (head == null) {
            head = p;
            p.next = head;
            return;
        }

        Process temp = head;
        while (temp.next != head)
            temp = temp.next;

        temp.next = p;
        p.next = head;
    }
}
