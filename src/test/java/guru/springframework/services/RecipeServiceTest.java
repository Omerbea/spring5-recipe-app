package guru.springframework.services;

import guru.springframework.domain.Recipe;
import guru.springframework.repositories.RecipeRepository;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class RecipeServiceTest {

    RecipeService recipeService;

    @Mock
    RecipeRepository recipeRepository;


    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        recipeService = new RecipeService(recipeRepository);
    }

    @Test
    public void getRecipes() {
        HashSet<Recipe> recipeHashSet = new HashSet<>();

        when(recipeService.getRecipes()).thenReturn((Set<Recipe>) recipeHashSet);
        Set<Recipe> recipeSet = recipeService.getRecipes();
        assertEquals(recipeSet.size(), 0);

    }
}