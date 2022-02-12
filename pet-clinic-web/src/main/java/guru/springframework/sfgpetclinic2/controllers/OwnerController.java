package guru.springframework.sfgpetclinic2.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//Another way to specify requestmapping root directory prefix
@RequestMapping("/owners")
@Controller
public class OwnerController {

    @RequestMapping({"","/", "/index", "/index.html"})
    public String listOwners(){

        return "owners/index";
    }
}
