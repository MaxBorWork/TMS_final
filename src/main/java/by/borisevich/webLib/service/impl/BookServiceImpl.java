package by.borisevich.webLib.service.impl;

import by.borisevich.webLib.dao.BookDao;
import by.borisevich.webLib.model.Book;
import by.borisevich.webLib.service.BookService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Resource
    private BookDao bookDao;

    @Override
    public void addBook(Book book) {
        bookDao.addBook(book);
    }

    @Override
    public List<Book> getBookList() {
        return bookDao.getBookList();
    }

    @Override
    public Book getBookByTitle(String bookTitle) {
        return bookDao.getBookByTitle(bookTitle);
    }

    @Override
    public Book getBookByBookID(String bookID) {
        return bookDao.getBookByBookID(bookID);
    }


}
