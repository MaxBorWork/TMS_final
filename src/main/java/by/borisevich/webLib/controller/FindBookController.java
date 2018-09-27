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
public class FindBookController {

    @Autowired
    private BookService bookService;

    @RequestMapping(value = "/findBook", method = RequestMethod.GET)
    public ModelAndView getBookTitle(HttpServletRequest request, HttpServletResponse response) {
      ModelAndView modelAndView = new ModelAndView("findBook");
      modelAndView.addObject("book", new Book());
      return modelAndView;
    }

    @RequestMapping(value = "/findingProcess", method = RequestMethod.POST)
    public ModelAndView showBook(HttpServletRequest request, HttpServletResponse response, @ModelAttribute("book") Book book) {
        ModelAndView modelAndView = null;
        Book foundBbook = bookService.getBookByTitle(book.getBookTitle());

        if (foundBbook != null) {
            modelAndView = new ModelAndView("bookPage");
            modelAndView.addObject("bookImage", foundBbook.getBookImageLink());
            modelAndView.addObject("bookTitle", foundBbook.getBookTitle());
            modelAndView.addObject("bookAuthor", foundBbook.getBookAuthor());
            modelAndView.addObject("bookYear", foundBbook.getYearOfPublish());
            modelAndView.addObject("bookDescription", foundBbook.getBookDescription());
        }
        else {
            modelAndView = new ModelAndView("errorPage");
            modelAndView.addObject("message", "No books were found");
        }
        return modelAndView;
    }
}
