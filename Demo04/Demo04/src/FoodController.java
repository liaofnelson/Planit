import java.util.ArrayList;

public class FoodController {
    private FoodModel fm = new FoodModel();
    /**
     * main controller
     *
     * @param a user require data- user choose function
     */
    public void action(int a){
        switch (a) {
            case 1:
                int sa = FoodPage.selShowBy();
                selAction(sa);
                break;
            case 0:
                System.out.println("Exit");
                System.exit(0);
                break;
        }
    }
    /**
     * look up function
     * @param sa
     */
    private void selAction(int sa) {
        switch (sa) {
            case 1: // list all
                ArrayList<Food> allFoodList = fm.getAll();
                FoodPage.showFoodList(allFoodList);
            break;
            case 2: // food
                 String Food = FoodPage.getFood(); //get food
                 ArrayList<Food> foodListByName = fm.getByFoodName(Food); //get food name
                 FoodPage.showFoodList(foodListByName);
                 break;
            case 3:
                String Restaurant = FoodPage.getRestaurant(); //get restaurant
                ArrayList<Food> foodListByRestaurant = fm.getByFoodName(Restaurant); //get restaurant name
                FoodPage.showFoodList(foodListByRestaurant);
                break;


        }
    }

}
