package by.borisevich.webLib.dao;

import by.borisevich.webLib.model.Book;

import java.util.List;

public interface BookDao {

    void addBook(Book book);

    List<Book> getBookList();

    Book getBookByTitle(String bookTitle);

    Book getBookByBookID(String bookID);

    Book getBookByID(int id);

    void updateBook(Book book);

    void deleteBook(int id);
}
