package com.ShacharAnetDev.Recipes_API.Service;

import java.util.List;

import com.ShacharAnetDev.Recipes_API.Entities.Recipe;

public interface RecipeService {

	void addRecipe(Recipe recipe);

	List<Recipe> getAllRecipes();

	Recipe getRecipe(Integer id);

}
