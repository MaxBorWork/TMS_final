package by.borisevich.webLib.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class ErrorController {

    private Logger log = LoggerFactory.getLogger(ErrorController.class);

    @RequestMapping(value = "errors", method = RequestMethod.GET)
    public ModelAndView renderErrorPage(HttpServletRequest httpRequest) {

        ModelAndView errorPage = new ModelAndView("errorPage");
        String errorMsg = "", errorTitle = "";
        int httpErrorCode = getErrorCode(httpRequest);
        String httpErrorMessage = getErrorMessage(httpRequest);
        switch (httpErrorCode) {
            case 400: {
                errorTitle = "400 error";
                errorMsg = "400 Error. Bad Request";
                log.info(String.valueOf(httpErrorCode) + "\n error message: " + httpErrorMessage);
                break;
            }
            case 401: {
                errorTitle = "401 error";
                errorMsg = "401 Error. Unauthorized";
                log.info(String.valueOf(httpErrorCode) + "\n error message: " + httpErrorMessage);
                break;
            }
            case 403: {
                errorTitle = "403 error";
                errorMsg = "403 Error. Unauthorized";
                log.info(String.valueOf(httpErrorCode) + "\n error message: " + httpErrorMessage);
                break;
            }
            case 404: {
                errorTitle = "404 error";
                errorMsg = "404 Error. Resource not found";
                log.info(String.valueOf(httpErrorCode) + "\n error message: " + httpErrorMessage);
                break;
            }
            case 500: {
                errorTitle = "500 error";
                errorMsg = "500 Error. Internal Server Error";
                log.info(String.valueOf(httpErrorCode) + "\n error message: " + httpErrorMessage);
                break;
            }
        }
        errorPage.addObject("errorMsg", errorMsg);
        errorPage.addObject("errorTitle", errorTitle);
        return errorPage;
    }

    private int getErrorCode(HttpServletRequest httpRequest) {
        return (Integer) httpRequest
                .getAttribute("javax.servlet.error.status_code");
    }

    private String getErrorMessage(HttpServletRequest httpRequest) {
        return (String) httpRequest
                .getAttribute("javax.servlet.error.message");
    }
}
