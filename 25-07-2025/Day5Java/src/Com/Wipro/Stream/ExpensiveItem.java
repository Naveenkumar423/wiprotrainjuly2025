package Com.Wipro.Stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class ExpensiveItem {

    public static void main(String[] args) {

        FoodItem f1 = new FoodItem("Manchurian", "Veg", "Chinese", 180);
        FoodItem f2 = new FoodItem("Spring Rolls", "Veg", "Chinese", 160);
        FoodItem f3 = new FoodItem("Chicken Lollipop", "Non Veg", "Chinese", 220);
        FoodItem f4 = new FoodItem("Pad Thai", "Non Veg", "Thai", 250);
        FoodItem f5 = new FoodItem("Grilled Chicken", "Non Veg", "Continental", 280);
        FoodItem f6 = new FoodItem("Pasta", "Veg", "Continental", 200);

        List<FoodItem> foodList = new ArrayList<>();
        foodList.add(f1);
        foodList.add(f2);
        foodList.add(f3);
        foodList.add(f4);
        foodList.add(f5);
        foodList.add(f6);

        Optional<FoodItem> mostExpensiveChinese = foodList.stream()
                .filter(f -> f.getCuisine().equalsIgnoreCase("Chinese"))
                .max(Comparator.comparingDouble(f -> f.price));

        if (mostExpensiveChinese.isPresent()) {
            System.out.println("Most expensive Chinese dish:");
            System.out.println(mostExpensiveChinese.get());
        } else {
            System.out.println("No Chinese dishes found.");
        }
    }
}
