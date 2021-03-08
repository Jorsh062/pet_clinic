package PetClinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import services.VetService;

@Controller
public class vetController {
    private final VetService vetService;


    public vetController(VetService vetService) {
        this.vetService = vetService;
    }


    @RequestMapping({ "/vets", "/vets/index", "/vets/index.html"})
    public String listOwners(Model model) {
        model.addAttribute("owners", vetService.findAll());
        return "owners/index";
    }
}
