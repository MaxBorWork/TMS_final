package by.borisevich.webLib.dao;

import by.borisevich.webLib.model.Book;

import java.util.List;

public interface BookDao {

    void createTable();

    void addBook(Book book);

    List<Book> getBookList();

    Book getBookByTitle(String bookTitle);

    Book getBookByBookID(String bookID);
}
