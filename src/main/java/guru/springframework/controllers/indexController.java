package guru.springframework.controllers;

import guru.springframework.repositories.CategoryRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class indexController {

    private CategoryRepository cat;

    public indexController(CategoryRepository cat) {
        this.cat = cat;
    }

    @GetMapping("/index")
    public String getCat(Model model){
        Long num = Long.valueOf(2);
        System.out.println(cat.findById(num).get().getDescription());
        return "index";
    }
}
