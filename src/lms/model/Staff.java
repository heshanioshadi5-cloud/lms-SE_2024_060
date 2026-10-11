package lms.model;

public class Staff extends Member {
    private String department;

    public Staff(String memberID, String name, String department) {
        super(memberID, name);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public void displayMemberDetails() {
        System.out.println("Staff [ID: " + getMemberID() + ", Name: " + getName() + ", Department: " + department + "]");
    }
}