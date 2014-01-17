package com.springapp.Controllers;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

/**
 * Created by dineshkb on 1/10/14.
 */
@Controller
@RequestMapping("/")
public class HomeController {
    @RequestMapping(method = RequestMethod.GET)
    public String Welcome(ModelMap model) {
        model.addAttribute("message", "Welcome");
        //return "Login";
        return "Home";
    }

    @RequestMapping(value="checkAjax", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody String getDetails(@RequestBody Test test)
    {
        System.out.println(test);
//        String textBox = "<input type=\"text\">";
        Test t = new Test();
        t.setName("TestJson");
        return "TestJson";
    }
}
