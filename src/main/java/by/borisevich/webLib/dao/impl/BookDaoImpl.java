package by.borisevich.webLib.dao.impl;

import by.borisevich.webLib.dao.BookDao;
import by.borisevich.webLib.dao.mapper.BookMapper;
import by.borisevich.webLib.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.List;

public class BookDaoImpl implements BookDao {

    private static final String SQL_CREATE_TABLE_BOOK_INFO = "CREATE TABLE IF NOT EXISTS book_info (" +
            "id int NOT NULL AUTO_INCREMENT," +
            "book_id varchar(255) NOT NULL," +
            "title varchar(255) NOT NULL," +
            "category varchar(255)," +
            "author varchar(255)," +
            "year_of_publish int(10)," +
            "description text," +
            "image_link varchar(2083)," +
            "fb2_file varchar(2083)," +
            "epub_file varchar(2083)," +
            "pdf_file varchar(2083)," +
            "txt_file varchar(2083)," +
            "PRIMARY KEY (ID)" +
            ");";

    private static final String SQL_INSERT_BOOK_INFO = "INSERT INTO book_info " +
            "VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";

    private static final String SQL_SELECT_ALL_BOOKS = "SELECT * FROM book_info";

    private static final String SQL_SELECT_BOOK_BY_TITLE = "SELECT * FROM book_info WHERE title=?";

    private static final String SQL_SELECT_BOOK_BY_BOOK_ID = "SELECT * FROM book_info WHERE book_id=?";

    private static Logger log = LoggerFactory.getLogger(BookDaoImpl.class);

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void createTable() {
        jdbcTemplate.execute(SQL_CREATE_TABLE_BOOK_INFO);
    }

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
    }

    @Override
    public List<Book> getBookList() {
        return jdbcTemplate.query(SQL_SELECT_ALL_BOOKS, new BookMapper());
    }

    @Override
    public Book getBookByTitle(String bookTitle) {
        try {
            Book book = jdbcTemplate.queryForObject(SQL_SELECT_BOOK_BY_TITLE, new Object[] {bookTitle}, new BookMapper());
            return book;
        } catch  (Exception e) {
            log.info("no book was found");
            return null;
        }
    }

    @Override
    public Book getBookByBookID(String bookID) {
        try {
            Book book = jdbcTemplate.queryForObject(SQL_SELECT_BOOK_BY_BOOK_ID, new Object[] {bookID}, new BookMapper());
            return book;
        } catch  (Exception e) {
            log.info("no book was found");
            return null;
        }
    }
}
