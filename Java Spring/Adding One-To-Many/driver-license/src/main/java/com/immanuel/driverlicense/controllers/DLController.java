package com.immanuel.driverlicense.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.immanuel.driverlicense.models.License;
import com.immanuel.driverlicense.models.Person;
import com.immanuel.driverlicense.services.LicenseService;
import com.immanuel.driverlicense.services.PersonService;

@Controller
public class DLController {

    private final PersonService personService;
    private final LicenseService licenseService;

    @Autowired
    public DLController(PersonService personService, LicenseService licenseService) {
        this.personService = personService;
        this.licenseService = licenseService;
    }

    @GetMapping("/persons/new")
    public String person(@ModelAttribute("person") Person person){
        return "person.jsp";
    }

    @PostMapping("/persons/create")
    public String personCreate(@ModelAttribute("person") Person person, Model model){
        personService.addPerson(person);

        return "redirect:/license/new";
    }
    
    @GetMapping("/license/new")
    public String license(@ModelAttribute("license") License license, Model model){
        List<Person> persons = personService.getAllPersons();
        model.addAttribute("persons", persons);
        return "license.jsp";
    }

    @PostMapping("/license/create")
    public String licenseCreate(@ModelAttribute("license") License license, Model model){
        licenseService.addLicense(license);

        return "redirect:/license/new";
    }
}