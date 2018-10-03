package by.borisevich.webLib.dao.impl;

import by.borisevich.webLib.dao.BookDao;
import by.borisevich.webLib.dao.mapper.BookMapper;
import by.borisevich.webLib.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Types;
import java.util.List;

public class BookDaoImpl implements BookDao {

    private static final String SQL_INSERT_BOOK_INFO = "INSERT INTO Book " +
            "VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";

    private static final String SQL_SELECT_ALL_BOOKS = "SELECT id, book_id, title, category, " +
            "author, year_of_publish, description, image_link, " +
            "fb2_file, epub_file, pdf_file, txt_file FROM Book";

    private static final String SQL_SELECT_BOOK_BY_ID = "SELECT id, book_id, title, category, " +
            "author, year_of_publish, description, image_link, " +
            "fb2_file, epub_file, pdf_file, txt_file FROM Book WHERE id=?";

    private static final String SQL_SELECT_BOOK_BY_TITLE = "SELECT id, book_id, title, category, " +
            "author, year_of_publish, description, image_link, " +
            "fb2_file, epub_file, pdf_file, txt_file FROM Book WHERE title=?";

    private static final String SQL_SELECT_BOOK_BY_BOOK_ID = "SELECT id, book_id, title, category, " +
            "author, year_of_publish, description, image_link, " +
            "fb2_file, epub_file, pdf_file, txt_file FROM Book WHERE book_id=?";

    private static final String SQL_UPDATE_BOOK = "UPDATE Book SET " +
            "book_id=?, title=?, category=?, author=?, year_of_publish=?, description=?, image_link=?, " +
            "fb2_file=?, epub_file=?, pdf_file=?, txt_file=? WHERE id=?";

    private static final String SQL_DELETE_BOOK_BY_ID = "DELETE FROM Book WHERE id=?";

    private static Logger log = LoggerFactory.getLogger(BookDaoImpl.class);

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void addBook(Book book) {
        jdbcTemplate.update(SQL_INSERT_BOOK_INFO, new Object[]{
            book.getId(),
            book.getBookID(),
            book.getBookTitle(),
            book.getBookCategoryName(),
            book.getBookAuthor(),
            book.getYearOfPublish(),
            book.getBookDescription(),
            book.getBookImageLink(),
            book.getBookFileFb(),
            book.getBookFileEpub(),
            book.getBookFilePdf(),
            book.getBookFileTxt()
        });
        log.info("Book " + book.getBookTitle() + " added");
    }

    @Override
    public List<Book> getBookList() {
        return jdbcTemplate.query(SQL_SELECT_ALL_BOOKS, new BookMapper());
    }

    @Override
    public Book getBookByTitle(String bookTitle) {
        try {
            Book book = jdbcTemplate.queryForObject(SQL_SELECT_BOOK_BY_TITLE, new Object[] {bookTitle},
                                                    new BookMapper());
            return book;
        } catch  (Exception e) {
            log.info("no book was found, caution: " + e);
            return null;
        }
    }

    @Override
    public Book getBookByBookID(String bookID) {
        try {
            Book book = jdbcTemplate.queryForObject(SQL_SELECT_BOOK_BY_BOOK_ID, new Object[] {bookID},
                                                    new BookMapper());
            return book;
        } catch  (Exception e) {
            log.info("no book was found, caution: " + e);
            return null;
        }
    }

    @Override
    public Book getBookByID(int id) {
        try {
            Book book = jdbcTemplate.queryForObject(SQL_SELECT_BOOK_BY_ID, new Object[] {id}, new BookMapper());
            return book;
        } catch  (Exception e) {
            log.info("no book was found, caution: " + e);
            return null;
        }
    }

    @Override
    public void updateBook(Book book) {
        jdbcTemplate.update(SQL_UPDATE_BOOK, new Object[]{
                book.getId(),
                book.getBookID(),
                book.getBookTitle(),
                book.getBookCategoryName(),
                book.getBookAuthor(),
                book.getYearOfPublish(),
                book.getBookDescription(),
                book.getBookImageLink(),
                book.getBookFileFb(),
                book.getBookFileEpub(),
                book.getBookFilePdf(),
                book.getBookFileTxt()
        });
        log.info("Book " + book.getBookTitle() + " updated");
    }

    @Override
    public void deleteBook(int id) {
        Book book = jdbcTemplate.queryForObject(SQL_SELECT_BOOK_BY_ID, new Object[] {id}, new BookMapper());
        if (book != null) {
            jdbcTemplate.update(SQL_DELETE_BOOK_BY_ID, new Object[] {id}, new int[] {Types.INTEGER});
            log.info("book " + book.getBookTitle() + " was deleted correctly");
        }
        log.info("no book was found");
    }
}
