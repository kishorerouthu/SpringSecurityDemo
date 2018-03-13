package com.css.spring.security;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Kishore Routhu on 26/2/18 4:04 PM.
 */
@Controller
public class WelcomeController {

    @RequestMapping(value = {"/home","/"}, method = RequestMethod.GET)
    public ModelAndView printWelcome(ModelAndView model, Principal principal) {
        System.out.println("****** WelcomeController *****");

        String name = principal.getName();
        model.addObject("username", name);
        model.setViewName("home");
        return model;
    }
}
