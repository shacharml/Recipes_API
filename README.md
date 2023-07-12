# Recipes API - Backend

This is the backend API for the Random Recipe Generator application built using Spring Boot. 
The API is responsible for handling requests from the frontend, fetching random recipes, and providing the necessary data in JSON format. 

JSON example:
```json
    {
          "name": "Chocolate Chip Cookies",
          "desciption": "1. Preheat oven to 350°F (175°C).\n2. Cream butter and sugars together.\n3. Beat in eggs and vanilla.\n4. Mix in flour, baking soda, and salt.\n5.                           Stir in chocolate chips.\n6. Bake for 8-10 minutes.\n7. Cool on wire racks.",
          "ingridiance": "Butter (1 cup)\nWhite sugar (1 cup)\nBrown sugar (1 cup)\nEggs (2)\nVanilla extract (2 teaspoons)\nAll-purpose flour (3 cups)\nBaking soda (1                                 teaspoon)\nSalt (1/2 teaspoon)\nChocolate chips (2 cups)",
          "urlImage": "https://images.unsplash.com/photo-1583743089695-4b816a340f82?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=870&q=80"
      }
```
The URL for adding the recipe: 
    `http://localhost:8081/recipe/add`
    
-----------------------------------------------------------------------------------
Another example to get a random recipe:
URL:
`http://localhost:8081/recipe/getRandomRecipe`

The response:
```json
{
    "id": 304,
    "name": "Pasta",
    "desciption": "1. Boil water in a pot and cook pasta until al dente.\n2. In a separate pan, heat olive oil and sauté garlic.\n3. Add your choice of vegetables or protein.\n4. Season with salt, pepper, and herbs.\n5. Drain the pasta and mix it with the sauce.\n6. Serve hot.",
    "ingridiance": "Pasta (200g)\nOlive oil (2 tablespoons)\nGarlic (2 cloves)\nVegetables/Protein (as desired)\nSalt (to taste)\nPepper (to taste)\nHerbs (to taste)",
    "urlImage": "https://images.unsplash.com/photo-1597131628347-c769fc631754?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=870&q=80"
}
```


-----------------------------------------------------------------------------------

The Library and APP URL: [https://github.com/shacharml/Recipes_API](https://github.com/shacharml/RecipeAPI_Library)
The library inside takes care of executing the HTTP requests, handling the responses, and parsing the JSON data into Java objects with the Retrofit library can be found in the retrofit2 package in the project's dependencies.
The library executes the HTTP requests to the API backend we build.

