package by.borisevich.webLib.controller;

import by.borisevich.webLib.model.Book;
import by.borisevich.webLib.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
public class ShowBooksController {

    @Autowired
    private BookService bookService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String showBooksOnHome(Model model) {
        model.addAttribute("book", new Book());
        model.addAttribute("booksList", bookService.getBookList());
        return "home";
    }

    @RequestMapping(value = "/listBooks", method = RequestMethod.GET)
    public ModelAndView showBooks(HttpServletRequest request, HttpServletResponse response) {
        ModelAndView modelAndView = new ModelAndView("listBooks");
        List<Book> books =  bookService.getBookList();
        modelAndView.addObject("books", books);
        return modelAndView;
    }

}
