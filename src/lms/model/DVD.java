package lms.model;

public class DVD extends LibraryItem {
    private double duration;

    public DVD(String itemID, String title, String author, double duration) {
        super(itemID, title, author);
        this.duration = duration;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    @Override
    public void displayDetails() {
        System.out.println("DVD [ID: " + getItemID() + ", Title: " + getTitle() + ", Author: " + getAuthor() + ", Duration: " + duration + " hrs, Available: " + isAvailable() + "]");
    }
}
