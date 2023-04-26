import java.util.ArrayList;
import java.util.List;

public class RestaurantManagement {

    public static void main(String[] args) {
        Meals pizza1 = new Pizza("Peperoni pizza", 30);
        Meals pizza2 = new Pizza("Toyuqlu pizza", 30);

        Drinks drink1 = new SoftDrink("redbull", 5);
        Drinks drink2 = new SoftDrink("Cola", 2);

        List<Meals> allMeals = new ArrayList<>();
        List<Drinks> allDrinks = new ArrayList<>();

        allMeals.add(pizza1);
        allMeals.add(pizza2);

        allDrinks.add(drink1);
        allDrinks.add(drink2);

        printMenu(allMeals, allDrinks);
    }

    public static void printMenu(List<Meals> allMeals, List<Drinks> allDrinks) {
        System.out.println("Yemekler:");
        for(Meals meal : allMeals) {
            System.out.println(meal);
        }
        System.out.println("*********************************************");

        System.out.println("ickiler:");
        for(Drinks drink : allDrinks) {
            System.out.println(drink);
        }
    }
}
