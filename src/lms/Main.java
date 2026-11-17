package lms;

import lms.model.Book;
import lms.model.DVD;
import lms.model.Staff;
import lms.model.Student;
import lms.service.Library;

public class Main {
    public static void main(String[] args) {

        Library library = new Library();

        Book b1 = new Book("B001", "Clean Code", "Robert C. Martin");
        Book b2 = new Book("B002", "Effective Java", "Joshua Bloch");
        DVD d1 = new DVD("D001", "Introduction to Algorithms", 120);


        library.addItem(b1);
        library.addItem(b2);
        library.addItem(d1);


        Student student = new Student("S001", "Alice");
        Staff staff = new Staff("ST001", "Bob");

        library.addMember(student);
        library.addMember(staff);


        System.out.println();
        library.printAllLateFees(3);


        System.out.println();
        library.streamIfPossible(d1);
        library.streamIfPossible(b1);
    }
}