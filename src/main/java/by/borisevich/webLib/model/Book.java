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
    private String bookFileFb;
    private String bookFileEpub;
    private String bookFilePdf;
    private String bookFileTxt;

    public Book(int id, String bookID, String bookTitle, String bookCategoryName, String bookAuthor,
                int yearOfPublish, String bookDescription, String bookImageLink,
                String bookFileFb, String bookFileEpub, String bookFilePdf, String bookFileTxt) {
        this.id = id;
        this.bookID = bookID;
        this.bookTitle = bookTitle;
        this.bookCategoryName = bookCategoryName;
        this.bookAuthor = bookAuthor;
        this.yearOfPublish = yearOfPublish;
        this.bookDescription = bookDescription;
        this.bookImageLink = bookImageLink;
        this.bookFileFb = bookFileFb;
        this.bookFileEpub = bookFileEpub;
        this.bookFilePdf = bookFilePdf;
        this.bookFileTxt = bookFileTxt;
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

    public String getBookFileFb() {
        return bookFileFb;
    }

    public void setBookFileFb(String bookFileFb) {
        this.bookFileFb = bookFileFb;
    }

    public String getBookFileEpub() {
        return bookFileEpub;
    }

    public void setBookFileEpub(String bookFileEpub) {
        this.bookFileEpub = bookFileEpub;
    }

    public String getBookFilePdf() {
        return bookFilePdf;
    }

    public void setBookFilePdf(String bookFilePdf) {
        this.bookFilePdf = bookFilePdf;
    }

    public String getBookFileTxt() {
        return bookFileTxt;
    }

    public void setBookFileTxt(String bookFileTxt) {
        this.bookFileTxt = bookFileTxt;
    }
}
