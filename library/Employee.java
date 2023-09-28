package library;

public class Employee implements Administrator, Librarian {
    private String name;
    public Employee(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    @Override
    public void find(Reader reader, String bookName) {
        System.out.printf("%s found the book %s to %s" + "\n", name, bookName, reader.getName());
    }

    @Override
    public void give(Reader reader, String bookName) {
        System.out.printf("%s gave the book %s to %s " + "\n", name, bookName, reader.getName());
    }

    @Override
    public void overdueNotification(Reader reader, String bookName) {
        System.out.printf("%s notified about the return of the book %s to %s " + "\n", name, bookName, reader.getName());
        reader.returnBook(this, bookName);
    }

    @Override
    public void order(Supplier supplier, int numberOfBooks) {
        System.out.printf("%s ordered %d books from %s " + "\n", name, numberOfBooks, supplier.getName());
        supplier.deliver(this, numberOfBooks);
    }
}
