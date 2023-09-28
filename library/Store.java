package library;

public class Store implements Supplier {
    private String name;

    public Store(String name) {
        this.name = name;
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public void deliver(Librarian librarian, int numberOfBooks) {
        System.out.printf("%s delivered %d books to library " + "\n ", name, numberOfBooks);
    }
}
