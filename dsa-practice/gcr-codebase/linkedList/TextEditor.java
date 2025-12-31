class TextEditor {

    class State {
        String text;
        State prev, next;

        State(String t) {
            text = t;
        }
    }

    State current;

    void addState(String text) {
        State s = new State(text);
        if (current != null) {
            current.next = s;
            s.prev = current;
        }
        current = s;
    }

    void undo() {
        if (current != null && current.prev != null)
            current = current.prev;
    }

    void redo() {
        if (current != null && current.next != null)
            current = current.next;
    }
}
