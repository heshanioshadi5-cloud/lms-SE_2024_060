package lms;

import lms.model.*;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("B001", "Java Programming", "James Gosling", 500);
        DVD dvd = new DVD("D001", "Inception", "Christopher Nolan", 2.5);

        Student student = new Student("S001", "Kamal Perera", "Year 2");
        Staff staff = new Staff("ST001", "Nimal Silva", "IT Department");

        System.out.println("--- Library Items ---");
        book.displayDetails();
        dvd.displayDetails();

        System.out.println("\n--- Members ---");
        student.displayMemberDetails();
        staff.displayMemberDetails();
    }
}
