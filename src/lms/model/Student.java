package lms.model;

public class Student extends Member {
    private String studentGrade;

    public Student(String memberID, String name, String studentGrade) {
        super(memberID, name);
        this.studentGrade = studentGrade;
    }

    public String getStudentGrade() {
        return studentGrade;
    }

    public void setStudentGrade(String studentGrade) {
        this.studentGrade = studentGrade;
    }

    @Override
    public void displayMemberDetails() {
        System.out.println("Student [ID: " + getMemberID() + ", Name: " + getName() + ", Grade: " + studentGrade + "]");
    }
}

