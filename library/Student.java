package library;

public class Student implements Reader{
    private String name;
    public Student(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    @Override
    public void take(Administrator administrator, String bookName) {
        administrator.give(this, bookName);
    }
    @Override
    public void returnBook(Administrator administrator, String bookName) {
        System.out.printf("Student %s returned the book %s to library " + "\n", name, bookName);

    }
}
