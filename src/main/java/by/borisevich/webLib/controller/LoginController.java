package by.borisevich.webLib.controller;

import by.borisevich.webLib.model.Login;
import by.borisevich.webLib.model.User;
import by.borisevich.webLib.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class LoginController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public ModelAndView getLoginInfo(HttpServletRequest request, HttpServletResponse response) {
        ModelAndView modelAndView = new ModelAndView("login");
        modelAndView.addObject("login", new Login());
        return modelAndView;
    }

    @RequestMapping(value = "/loginProcess", method = RequestMethod.POST)
    public String confirmInfo(Model model, @ModelAttribute("login") Login login) {

        User user = userService.loginUser(login);

        if (user != null) {
            model.addAttribute("successLogin", "Log in sucessfully!");
            return "home";
        } else  {
            model.addAttribute("message", "Username or Password is wrong!");
            return "login";
        }
    }
}
