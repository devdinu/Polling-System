package com.springapp.Controllers;

import com.springapp.Services.IdeaService;
import com.springapp.mvc.domain.Idea;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

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
        return "Status";
    }

    @RequestMapping(value = "listIdeas", method = RequestMethod.GET)
    public String listIdeas(ModelMap modMap, Idea idea) {
        List<Idea> ideaList = ideaService.list();
        modMap.addAttribute("ideas", ideaList);
        modMap.addAttribute("ideasCount", ideaList.size());
        return "ViewIdeas";
    }

    @RequestMapping(value = "pollIdea", method = RequestMethod.POST)
    public String pollIdea(ModelMap modelMap, @RequestParam("chosenIdea") int ideaId) {
        ideaService.poll(ideaId);
        modelMap.addAttribute("message", "Poll Success");
        return "Status";
    }
}
