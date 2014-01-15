package com.springapp.mvc;

import com.springapp.mvc.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("Home")
public class LoginController {

    @RequestMapping(value = "login", method = RequestMethod.POST)
    public ModelAndView printWelcome(User user, ModelMap model) {
        model.addAttribute("message", "Hi " + user);
        return new ModelAndView("Ideas", "user", user);
    }

    @RequestMapping(value = "login", method = RequestMethod.GET)
    public String printCategory(ModelMap map) {
        //validate user
        map.addAttribute("message", "LOGIN, Enter your Credentials....");
        return "Login";
    }
}




