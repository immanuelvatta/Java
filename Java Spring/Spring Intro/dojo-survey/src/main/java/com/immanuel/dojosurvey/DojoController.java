package com.immanuel.dojosurvey;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.http.HttpSession;



@Controller
public class DojoController {

    @GetMapping("/")
    public String index(Model model) {
        Survey survey = new Survey();
        model.addAttribute("survey", survey);
        return "index.jsp";
    }
    
    @GetMapping("/survey")
    public String survey(Survey survey, HttpSession session) {
        System.out.println(survey);
        session.setAttribute("name", survey.getName());
        session.setAttribute("location", survey.getLocation());
        session.setAttribute("language", survey.getLanguage());
        return "redirect:/";
    }
    
}
