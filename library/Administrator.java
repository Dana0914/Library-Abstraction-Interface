package library;

public interface Administrator {
    public String getName();
    void find(Reader reader, String bookName);
    void give(Reader reader, String bookName);
    void overdueNotification(Reader reader, String bookName);
}
