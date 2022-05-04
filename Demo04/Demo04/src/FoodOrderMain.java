
/**
 * @ClassName FoodOrderMain
 * @Description: TODO main and test
 * @Author: Fengyu Liao
 */
public class FoodOrderMain {
    //instantiate a controller object
    private static FoodController sc = new FoodController();

    public static void main(String[] args) {
        Global.initFoodList();

        while (true){
            int a = FoodPage.welcome();
            sc.action(a);
        }
    }
}
