package lms.model;

public class Book extends LibraryItem {
    private int pageCount;

    public Book(String itemID, String title, String author, int pageCount) {
        super(itemID, title, author);
        this.pageCount = pageCount;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    @Override
    public void displayDetails() {
        System.out.println("Book [ID: " + getItemID() + ", Title: " + getTitle() + ", Author: " + getAuthor() + ", Pages: " + pageCount + ", Available: " + isAvailable() + "]");
    }
}