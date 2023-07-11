package com.ShacharAnetDev.Recipes_API.Controller;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ShacharAnetDev.Recipes_API.Entities.Recipe;
import com.ShacharAnetDev.Recipes_API.Service.RecipeService;

@RestController
@RequestMapping("/recipe")
public class RecipeController {

	@Autowired
	private RecipeService recipeService;
	
	@PostMapping("/add")
	public String addRecipe(@RequestBody Recipe recipe) {
		recipeService.addRecipe(recipe);
		
		return recipe.toString();
	}
	
	@GetMapping("/getAllRecipes")
	public List<Recipe> getRecipes(){
		return recipeService.getAllRecipes();
	}
	
	@GetMapping("/getRandomRecipe")
	public Recipe getRandomRecipe(){
		List<Recipe> recipes = recipeService.getAllRecipes();
		int rand = (int)(Math.random() * recipes.size());
		System.out.println(rand);
		return recipes.get(rand) ;
	}
	
	@GetMapping("/getRecipe")
	public Recipe getRecipe(@RequestParam Integer id){
		return recipeService.getRecipe(id);
	}
	
	
}
