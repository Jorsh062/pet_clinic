package com.josh.pets.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.josh.pets.services.VetService;

@Controller
public class VetController {
    private final VetService vetService;


    public VetController(VetService vetService) {
        this.vetService = vetService;
    }


    @RequestMapping({ "/vets", "/vets/index", "/vets/index.html", "/vets.html"})
    public String listOwners(Model model) {
        model.addAttribute("vets", vetService.findAll());
        return "vets/index";
    }
}
