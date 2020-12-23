package guru.springframework.services;

import guru.springframework.commands.IngredientCommand;

/**
 * @author frank
 * @create 2020-12-22
 */
public interface IngredientService {
    IngredientCommand findByRecipeIdAndIngredientId(Long recipeId, Long ingredietId);
}
