package com.immanuel.dojosandninjas.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.immanuel.dojosandninjas.models.Dojo;
import com.immanuel.dojosandninjas.services.DojoService;

import jakarta.validation.Valid;

@Controller
public class DojoController {

    @Autowired
    DojoService dojoService;

    @GetMapping("/dojos/new")
    public String newDojo(@ModelAttribute("dojo") Dojo dojo) {
        return "dojo.jsp";
    }
    @PostMapping("/dojos/create")
    public String dojoCreate(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult result) {
        if (result.hasErrors()) {
            return "dojo.jsp";

        }else{
            dojoService.addDojo(dojo);
            return "redirect:/ninjas/new";
        }
    }

    @GetMapping("/dojos/{id}")
    public String dojoDisplay(@PathVariable("id") Long id, Model model) {
        Dojo dojo = dojoService.findDojoById(id);
        model.addAttribute("dojo", dojo);
        return "dojo-show.jsp";
    }
}