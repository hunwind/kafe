import java.util.ArrayList;
import java.util.List;

public class Order{

   List<Meals> meals;
   List<Drinks> drinks;


    public Order(List<Meals> meals, List<Drinks> drinks) {
        this.meals = new ArrayList<>();
        this.drinks = new ArrayList<>();
    }

    public void addMeal(Meals meal) {
        meals.add(meal);
    }

    public void addDrink(Drinks drink) {
        drinks.add(drink);
    }


}
