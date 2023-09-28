package library;
public class Main {
    public static void main(String[] args) {
        Student student = new Student("Alex");
        Employee employee = new Employee("Administrator");
        Employee employee2 = new Employee("Librarian");
        Store store = new Store("Book Store");
        student.take(employee2, "War and Peace");
        employee.overdueNotification(student, "War and Peace");
        employee2.order(store, 20);

    }
}
