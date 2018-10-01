package by.borisevich.webLib.controller;

import by.borisevich.webLib.model.Book;
import by.borisevich.webLib.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@Controller
public class HomeController {

    @Autowired
    private BookService bookService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String showBooksOnStart() {
//        model.addAttribute("book", new Book());
//        model.addAttribute("booksList", bookService.getBookList());
        return "home";
    }

    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String logout(SessionStatus sessionStatus, HttpServletRequest request, HttpServletResponse response) {
        sessionStatus.setComplete();
        request.getSession().setAttribute("login", null);
        return "home";
    }

}
