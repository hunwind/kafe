import java.util.ArrayList;
import java.util.List;

public class Order {

    List<Meals> meals = new ArrayList<>();
    List<Drinks> drinks = new ArrayList<>();

    public void addMeal(Meals meal) {
        meals.add(meal);
    }

    public void addDrink(Drinks drink) {
        drinks.add(drink);
    }

    public int calculateTotalPrice() {
        int totalPrice = 0;

        for (Meals meal : meals) {
            totalPrice += meal.getPrice();
        }

        for (Drinks drink : drinks) {
            totalPrice += drink.getPrice();
        }

        return totalPrice;
    }
}
