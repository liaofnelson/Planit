import java.util.ArrayList;


/**
 * @ClassName FoodModel
 * @Description: TODO data processing model layer
 * @Author: Fengyu Liao
 */
public class FoodModel {
    /**
     * Get all food information
     * @return all food information
     */
    public ArrayList<Food> getAll() { return Global.FoodList; }

    /**
     * look up by food name
     * @param FoodName
     * @return results collection
     */
     public ArrayList<Food> getByFoodName(String FoodName){
         ArrayList<Food> resList = new ArrayList<>();

         for (Food food : Global.FoodList){
             if (FoodName.equals(food.getFood()))
                 resList.add(food);

         }
         return resList;
     }



}
