package by.borisevich.webLib.controller;

import by.borisevich.webLib.model.Book;
import by.borisevich.webLib.model.User;
import by.borisevich.webLib.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes(value = "loggedUser")
public class HomeController {

    @Autowired
    private BookService bookService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String showBooksOnStart(Model model) {
        model.addAttribute("book", new Book());
        model.addAttribute("loggedUser", new User());
        model.addAttribute("booksList", bookService.getBookList());
        return "home";
    }

    @RequestMapping(value = "home", method = RequestMethod.GET)
    public String showBooksOnHome(Model model) {
        model.addAttribute("book", new Book());
        model.addAttribute("booksList", bookService.getBookList());
        return "home";
    }
}
