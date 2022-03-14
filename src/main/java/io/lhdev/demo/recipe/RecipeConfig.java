package io.lhdev.demo.recipe;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class RecipeConfig {

    @Bean
    CommandLineRunner commandLineRunner(RecipeRepository recipeRepository) {
        return args -> {
            Recipe recipe1 = new Recipe(
                    "Grilled Cheese",
                    "cheese, butter, choice of bread",
                    "1. Melt butter in pan 2. Toast bread with cheese 3. Serve and enjoy!"
            );
            Recipe recipe2 = new Recipe(
                    "Sunny side eggs",
                    "eggs, oil or butter, salt and pepper",
                    "1. Heat oil/butter in pan 2. Crack open 2 eggs and fry for 4 minutes on medium heat. " +
                            "3. Add salt & pepper to taste."
            );

            recipeRepository.saveAll(
                    List.of(recipe1, recipe2)
            );
        };
    }
}

