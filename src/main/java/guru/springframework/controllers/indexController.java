package guru.springframework.controllers;

import guru.springframework.services.RecipeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class indexController {

    private final RecipeService recipeService;

    public indexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @GetMapping("/index")
    public String getCat(Model model){

        model.addAttribute("recipes" , recipeService.getRecipes());
        return "index";
    }
}
