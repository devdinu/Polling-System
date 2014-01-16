package com.springapp.Controllers;

import com.springapp.Services.UserService;
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
    public ModelAndView printWelcome(User user, ModelMap model, @RequestParam("userStatus") String userStatus, @RequestParam("credential") String credential, String pollType) {
        boolean authenticated = false;
        model.addAttribute("message", "Hi " + user + " " + userStatus);
        if (userStatus.equalsIgnoreCase("sign_in")) {
            //validate user
            //should call based on input with name or id
            //default id now
            if ((credential.equals("userId") && userService.validate(user.getId(), user.getPassword()))
                    ||
                    (userService.validate(user.getName(), user.getPassword()))) {
                authenticated = true;
            }


        } else {
            //new user create credentials
            userService.creUser(user);
            authenticated = true;
        }
        if (authenticated) {
            if (pollType.equals("poll"))
                return new ModelAndView("Ideas", "user", user);
            else //(pollType.equals("post"))
                return new ModelAndView("View");
        } else
            return new ModelAndView("Login", "message", "login attempt failed");
    }
}




