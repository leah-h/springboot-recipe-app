package io.lhdev.demo.recipe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
        Optional<Recipe> recipeOptional = recipeRepository.findRecipeByName(recipe.getName());
        if (recipeOptional.isPresent()) {
            throw new IllegalStateException("recipe already exists");
        }
        recipeRepository.save(recipe);
    }
}
