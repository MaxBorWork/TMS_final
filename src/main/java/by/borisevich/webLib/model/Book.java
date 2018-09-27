package by.borisevich.webLib.model;

public class Book {

    private int id;
    private String bookID;
    private String bookTitle;
    private String bookCategoryName;
    private String bookAuthor;
    private int yearOfPublish;
    private String bookDescription;
    private String bookImageLink;

    public Book(int id, String bookTitle, String bookID, String bookCategoryName, String bookAuthor,
                int yearOfPublish, String bookDescription, String bookImageLink) {
        this.id = id;
        this.bookTitle = bookTitle;
        this.bookID = bookID;
        this.bookCategoryName = bookCategoryName;

        this.bookAuthor = bookAuthor;
        this.yearOfPublish = yearOfPublish;
        this.bookDescription = bookDescription;
        this.bookImageLink = bookImageLink;
    }

    public Book() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getBookCategoryName() {
        return bookCategoryName;
    }

    public void setBookCategoryName(String bookCategoryName) {
        this.bookCategoryName = bookCategoryName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public int getYearOfPublish() {
        return yearOfPublish;
    }

    public void setYearOfPublish(int yearOfPublish) {
        this.yearOfPublish = yearOfPublish;
    }

    public String getBookDescription() {
        return bookDescription;
    }

    public void setBookDescription(String bookDescription) {
        this.bookDescription = bookDescription;
    }

    public String getBookID() {
        return bookID;
    }

    public void setBookID(String bookID) {
        this.bookID = bookID;
    }

    public String getBookImageLink() {
        return bookImageLink;
    }

    public void setBookImageLink(String bookImageLink) {
        this.bookImageLink = bookImageLink;
    }
}
