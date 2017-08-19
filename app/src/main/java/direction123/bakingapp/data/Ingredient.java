package direction123.bakingapp.data;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

/**
 * Created by fangxiangwang on 8/19/17.
 */

@Table(name = "ingredients")
public class Ingredient extends Model {
    @Column(name = "id")
    public int id;

    @Column(name = "quantity")
    public double quantity;

    @Column(name = "measure")
    public String measure;

    @Column(name = "ingredient")
    public String ingredient;

    @Column(name = "recipe", onDelete = Column.ForeignKeyAction.CASCADE)
    public Recipe recipe;

    public Ingredient() {
        super();
    }

    public Ingredient(int id, double quantity, String measure, String ingredient, Recipe recipe) {
        super();
        this.id = id;
        this.quantity = quantity;
        this.measure = measure;
        this.ingredient = ingredient;
        this.recipe = recipe;
    }
}