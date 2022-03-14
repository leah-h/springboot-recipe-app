package io.lhdev.demo.recipe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecipeService {

    private final RecipeRepository recipeRepository;

    @Autowired
    public RecipeService(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    public List<Recipe> getRecipes() {
       return recipeRepository.findAll();
    }

    public void addNewRecipe(Recipe recipe) {
        System.out.println(recipe);
    }
}
