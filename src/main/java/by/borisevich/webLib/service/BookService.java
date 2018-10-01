package by.borisevich.webLib.service;

import by.borisevich.webLib.model.Book;

import java.util.List;

public interface BookService {

    void addBook(Book book);

    List<Book> getBookList();

    Book getBookByTitle(String bookTitle);

    Book getBookByBookID(String bookID);

    Book getBookByID(int id);

    void updateBook(Book book);

    void deleteBook(int id);
}
