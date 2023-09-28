package library;

public interface Librarian {
    public String getName();
    void order(Supplier supplier, int numberOfBooks);
}
