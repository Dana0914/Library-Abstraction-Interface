package library;

public interface Reader {
    String getName();


    void take(Administrator administrator, String bookName);


    void returnBook(Administrator administrator, String bookName);
}
