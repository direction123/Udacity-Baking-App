package direction123.bakingapp.utilities;

import android.content.Intent;
import android.util.Log;

import com.activeandroid.query.Delete;

import java.util.List;

import direction123.bakingapp.R;
import direction123.bakingapp.data.RecipeWidget;
import direction123.bakingapp.models.Recipe;

/**
 * Created by fangxiangwang on 8/19/17.
 */

public class DBUtils {
    public static void saveWidgetToDB (Recipe recipe) {
        if(recipe != null) {
                new Delete().from(RecipeWidget.class).where("recipe_id = ?",recipe.getId()).execute();
                RecipeWidget recipeWidget = new RecipeWidget(
                        recipe.getId(),
                        recipe.getName(),
                        recipe.getServings(),
                        recipe.getIngredients()
                );
                recipeWidget.save();
        }
    }

    public static void deleteWidgetFromDB (Recipe recipe) {
        if(recipe != null) {
            new Delete().from(RecipeWidget.class).where("recipe_id = ?",recipe.getId()).execute();
        }
    }
}
