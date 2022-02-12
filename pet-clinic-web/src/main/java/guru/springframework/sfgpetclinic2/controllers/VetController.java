package guru.springframework.sfgpetclinic2.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetController {

    @RequestMapping({"/vets", "/vets/index", "/vets/index.html"})
    public String listVets(){

        // Thymeleaf template will be returned here
        return "vets/index";
    }
}
