package com.ShacharAnetDev.Recipes_API.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ShacharAnetDev.Recipes_API.Entities.Recipe;

public interface RecipeRepository extends JpaRepository<Recipe, Integer>{

}
