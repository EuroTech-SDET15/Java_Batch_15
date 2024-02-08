package day38;

public class Book {

    int pageNumber;
    String author;
    boolean isPublished;
    long ssID;
    String category;
    String title;


    public Book(int pageNumber, String author, long ssID) {
        this.pageNumber = pageNumber;
        this.author = author;
        this.ssID = ssID;
        isPublished = true;
    }

    public Book(int pageNumber, String author, long ssID, String title) {
        this(pageNumber, author, ssID);
        this.title = title;

    }

    public Book(int pageNumber, String author, String category, long ssID) {
        this(pageNumber, author, ssID);
        this.category = category;
    }
}
