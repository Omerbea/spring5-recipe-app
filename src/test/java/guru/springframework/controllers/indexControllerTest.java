package guru.springframework.controllers;

import guru.springframework.services.RecipeService;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.ui.Model;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.anySet;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

public class indexControllerTest {

    @Mock
    RecipeService rs ;

    @Mock
    Model model;

    indexController idxController;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks((this));

        idxController = new indexController(rs);
    }

    @Test
    public void mockMVC() throws Exception {
        MockMvc mockMvc = MockMvcBuilders.standaloneSetup(idxController).build();
        mockMvc.perform(get("/index")).andExpect(status().isOk())
                .andExpect((view().name("index")));
    }

    @Test
    public void getCat() {

         String viewName = idxController.getCat(model);
         assertEquals("index" , viewName);
         verify(rs , times(1)).getRecipes();
        verify(model , times(1)).addAttribute(eq("recipes" ), anySet());

    }
}