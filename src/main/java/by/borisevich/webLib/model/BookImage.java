package by.borisevich.webLib.model;

public class BookImage {

    private long bookId;
    private String imageName;
    private byte[] data;

    public BookImage(long bookId, String imageName, byte[] data) {
        this.bookId = bookId;
        this.imageName = imageName;
        this.data = data;
    }

    public BookImage() {
    }

    public long getBookId() {
        return bookId;
    }

    public void setBookId(long bookId) {
        this.bookId = bookId;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public byte[] getData() {
        return data;
    }

    public void setData(byte[] data) {
        this.data = data;
    }
}
