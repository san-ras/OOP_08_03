
import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<>();
    }

    public void addMeal(String meal) {
        boolean isAdded = false;
        for (String addedMeal : meals) {
            if (meal.equals(addedMeal)) {
                isAdded = true;
                break;
            }
        }
        if (!isAdded) {
            meals.add(meal);
        }
    }

    public void printMeals() {
        this.meals.forEach(System.out::println);
    }

    public void clearMenu() {
        this.meals.clear();
    }

}
