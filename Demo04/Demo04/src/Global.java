import java.util.ArrayList;

/**
 * @Class Global
 * @Description: TODO Global class,define some functional methods
 * author:Fengyu Liao
 */
public class Global {
    public static ArrayList<Food> FoodList = new ArrayList<>();

    //Constructor is privatized, it is forbidden to instantiate it outside the class
    private Global(){}

    public static void initFoodList() {
        FoodList.add(new Food("Awesome Pizza place", "Pepperoni Pizza", 20));
        FoodList.add(new Food("wild burger joint", "burger", 15));

    }

}
