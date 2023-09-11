package com.immanuel.dojosandninjas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.immanuel.dojosandninjas.models.Dojo;
import com.immanuel.dojosandninjas.models.Ninja;
import com.immanuel.dojosandninjas.services.DojoService;
import com.immanuel.dojosandninjas.services.NinjaService;

import jakarta.validation.Valid;

@Controller
public class NinjaController {

    @Autowired
    NinjaService ninjaService;

    @Autowired
    DojoService dojoService;

    @GetMapping("/ninjas/new")
    public String newNinja(@ModelAttribute("ninja") Ninja ninja, Model model){
        List<Dojo> dojos = dojoService.getAllDojos();
        model.addAttribute("dojos", dojos);
        return "ninja.jsp";
    }

    @PostMapping("/ninjas/create")
    public String ninjaCreate(@Valid @ModelAttribute("ninja") Ninja ninja, BindingResult result){
        if(result.hasErrors()){
            return "ninja.jsp";
        }else{
            ninjaService.addNinja(ninja);
            return "redirect:/ninjas/new";
        }
    }

}