package by.borisevich.webLib.dao.mapper;

import by.borisevich.webLib.model.Book;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class BookMapper implements RowMapper<Book> {
    @Override
    public Book mapRow(ResultSet resultSet, int i) throws SQLException {
        Book book = new Book();
        book.setId(resultSet.getInt("id"));
        book.setBookID(resultSet.getString("book_id"));
        book.setBookTitle(resultSet.getString("title"));
        book.setBookCategoryName(resultSet.getString("category"));
        book.setBookAuthor(resultSet.getString("author"));
        book.setYearOfPublish(resultSet.getInt("year_of_publish"));
        book.setBookDescription(resultSet.getString("description"));
        book.setBookImageLink(resultSet.getString("image_link"));
        return book;
    }
}
