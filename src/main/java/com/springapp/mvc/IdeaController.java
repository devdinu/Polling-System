package com.springapp.mvc;

import com.springapp.mvc.domain.Idea;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by dineshkb on 1/15/14.
 */
@Controller
@RequestMapping("Idea")
public class IdeaController {

    @Autowired
    IdeaService ideaService;

    @RequestMapping(value = "postIdea", method = RequestMethod.POST)
    public String postIdea(ModelMap modMap, Idea idea) {
        ideaService.create(idea);
        modMap.addAttribute("message", "Posted Idea successfully. " + idea);
        return "view";
    }
}
