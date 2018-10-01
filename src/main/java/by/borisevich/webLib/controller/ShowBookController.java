package by.borisevich.webLib.controller;

import by.borisevich.webLib.model.Book;
import by.borisevich.webLib.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
public class ShowBookController {

    @Autowired
    private BookService bookService;

    @RequestMapping(value = "/listBooks", method = RequestMethod.GET)
    public ModelAndView showBooks(HttpServletRequest request, HttpServletResponse response) {
        ModelAndView modelAndView = new ModelAndView("listBooks");
        List<Book> books =  bookService.getBookList();
        if (books.size() > 0) {
            modelAndView.addObject("books", books);
        } else {
            modelAndView.addObject("noBooks", "No books were found");
        }
        return modelAndView;
    }

    @RequestMapping(value = "/{bookID}", method = RequestMethod.GET)
    public String showBook(@PathVariable("bookID") String bookID, Model model) {
        Book foundBook = bookService.getBookByBookID(bookID);
        model.addAttribute("book", foundBook);
        return "bookPage";
    }
}
