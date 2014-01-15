package com.springapp.mvc;

import com.springapp.mvc.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("Home")
public class LoginController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "login", method = RequestMethod.POST)
    public ModelAndView printWelcome(User user, ModelMap model, @RequestParam("userStatus") String userStatus) {
        boolean authenticated = false;
        model.addAttribute("message", "Hi " + user + " " + userStatus);
        if (userStatus.equalsIgnoreCase("sign_in")) {
            System.out.println("validating");
            if (userService.validate(user.getId())) {
                authenticated = true;
            }

            //validate user

        } else {
            //new user create credentials
            userService.creUser(user);
            authenticated = true;
        }
        if (authenticated)
            return new ModelAndView("Ideas", "user", user);
        else
            return new ModelAndView("Login", "message", "login attemp failed");
    }
}




