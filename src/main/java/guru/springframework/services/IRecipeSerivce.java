package guru.springframework.services;

import guru.springframework.domain.Recipe;

import java.util.Set;

public interface IRecipeSerivce {

    Set<Recipe> getRecipes();
    Recipe getRecipeById(Long id);
}
