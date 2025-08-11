package Com.Wipro.Stream;

public class FoodItem {
    String foodName;
    String foodType; 
    String cuisine;
    double price;

    public FoodItem(String foodName, String foodType, String cuisine, double price) {
        this.foodName = foodName;
        this.foodType = foodType;
        this.cuisine = cuisine;
        this.price = price;
    }

    public String getCuisine() {
        return cuisine;
    }


    public String toString() {
        return foodName + " | " + foodType + " | " + cuisine + " | ₹" + price;
    }
}
