package PetClinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import services.vetService;

@Controller
public class vetController {
    private final vetService vetService;


    public vetController(services.vetService vetService) {
        this.vetService = vetService;
    }


    @RequestMapping({ "/vets", "/vets/index", "/vets/index.html"})
    public String listOwners(Model model) {
        model.addAttribute("owners", vetService.findAll());
        return "owners/index";
    }
}
