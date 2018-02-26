package guru.springframework.controllers;

import guru.springframework.services.RecipeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class recipeController {

    private final RecipeService recipeService;

    public recipeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping("/recipe/show/{id}")
    public String showById(@PathVariable String id , Model model) {
        model.addAttribute("recipe" , recipeService.getRecipeById(new Long(id)));

        return "recipe/show";
    }


}

