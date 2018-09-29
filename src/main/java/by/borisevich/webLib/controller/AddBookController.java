package by.borisevich.webLib.controller;

import by.borisevich.webLib.model.Book;
import by.borisevich.webLib.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class AddBookController {

    @Autowired
    private BookService bookService;

    @RequestMapping(value = "/addBook", method = RequestMethod.GET)
    public ModelAndView getBookInfo(HttpServletRequest request, HttpServletResponse response) {
        ModelAndView modelAndView = new ModelAndView("addBook");
        modelAndView.addObject("book", new Book());
        return modelAndView;
    }

    @RequestMapping(value = "/addingProcess", method = RequestMethod.POST)
    public String addBookInfo(HttpServletRequest request, HttpServletResponse response,
                              @ModelAttribute("book") Book book) {
        bookService.addBook(book);
        return "home";
    }
}
