package com.ShacharAnetDev.Recipes_API.Service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.ShacharAnetDev.Recipes_API.Entities.Recipe;
import com.ShacharAnetDev.Recipes_API.Repository.RecipeRepository;
import com.ShacharAnetDev.Recipes_API.Service.RecipeService;

@Service
public class RecipeServiceImpl implements RecipeService {

	@Autowired
	private RecipeRepository repository;

	@Override
	public void addRecipe(Recipe recipe) {
		repository.save(recipe);
	}

	@Override
	public List<Recipe> getAllRecipes() {
		return repository.findAll();
	}

	@Override
	public Recipe getRecipe(Integer id) {
		Recipe recipe = repository
				.findById(id)
				.orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND, "Invalide Recipe Id " +id));
		return recipe;
	}

}
