package guru.springframework.controllers;

import guru.springframework.commands.IngredientCommand;
import guru.springframework.commands.RecipeCommand;
import guru.springframework.services.IngredientService;
import guru.springframework.services.RecipeService;
import junit.framework.TestCase;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

/**
 * @author frank
 * @create 2020-12-22
 */
public class IngredientControllerTest extends TestCase {

    @Mock
    IngredientService ingredientService;

    @Mock
    RecipeService recipeService;

    IngredientController controller;

    MockMvc mockMvc;



    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        controller =new IngredientController(recipeService,ingredientService);
        mockMvc=MockMvcBuilders.standaloneSetup(controller).build();
    }

    public void testListIngredients() throws Exception{
        RecipeCommand recipeCommand=new RecipeCommand();
        when(recipeService.findCommandById(anyLong())).thenReturn(recipeCommand);

        mockMvc.perform(get("/recipe/1/ingredients"))
                .andExpect(status().isOk())
                .andExpect(view().name("recipe/ingredient/list"))
                .andExpect(model().attributeExists("recipe"));
        verify(recipeService, times(1)).findCommandById(anyLong());
    }
    public void testShowIngredient() throws Exception{
        IngredientCommand ingredientCommand=new IngredientCommand();
         when(ingredientService.findByRecipeIdAndIngredientId(anyLong(),anyLong())).thenReturn(ingredientCommand);

        mockMvc.perform(get("/recipe/1/ingredient/2/show"))
                .andExpect(status().isOk())
                .andExpect(view().name("recipe/ingredient/show"))
                .andExpect(model().attributeExists("ingredient"));
    }
}