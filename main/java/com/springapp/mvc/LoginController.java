package com.springapp.mvc;

import com.springapp.mvc.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("Home")
public class LoginController {

    @RequestMapping(value = "login", method = RequestMethod.POST)
    public String printWelcome(User user, ModelMap model, @RequestParam("password") String pwd) {
        model.addAttribute("message", "Hi " + user+ " " + pwd);
        return "Home";
    }

    @RequestMapping(value = "category", method = RequestMethod.GET)
    public String printCategory(ModelMap map) {
        map.addAttribute("message", "category....");
        return "Home";
    }
}




