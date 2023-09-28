package library;

public interface Supplier {
    String getName();
    void deliver(Librarian librarian, int numberOfBooks);
}
