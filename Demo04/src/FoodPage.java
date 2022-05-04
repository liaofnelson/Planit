import java.util.ArrayList;
import java.util.Scanner;

/**
 * @ClassName FoodPage
 * @Description: TODO Page class, view layer data display and request data acquisition
 * @Author: Fengyu liao
 */
public class FoodPage {
    private FoodPage() {
    }

    /**
     * Welcome page, Get users operational data
     *
     * @return users operational purpose
     */
    public static int welcome() {
        System.out.println("* ********************************* *");
        System.out.println("* Welcome use simplify food ordering system");
        System.out.println("* 1 - look up food and restaurant");
        System.out.println("* 0 - exit system");
        System.out.println("* ********************************* *");

        int a;
        do {
            System.out.print("please enter correct number: ");
            a = new Scanner(System.in).nextInt();
        } while (a < 0 || a > 1);

        return a;

    }

    /**
     * Query secondary menu page
     *
     * @return query basis
     */
    public static int selShowBy() {
        System.out.println("* ********************************* *");
        System.out.println("* Query function selection page");
        System.out.println("* 1 - Inquire all");
        System.out.println("* 2 - Search by food");
        System.out.println("* 3 - Search by restaurant");
        System.out.println("* ********************************* *");

        int a;
        do{
            System.out.print("Please enter the correct query number: ");
            a = new Scanner(System.in).nextInt();
        } while (a < 0 || a > 4);

        return a;
    }
    /**
     * show food information
     *
     * @param FoodList
     */
    public static void showFoodList(ArrayList<Food> FoodList) {
        String[] food = {"Pepperoni Pizza", "Burger"};

        //System.out.printf("(\"┌────┬────────────┬──────\\n\")");
        System.out.printf("│%-4s│%-12s│%-6s│\n", "Restaurant", "Food", "Price");
        for (Food Food : FoodList) {
            System.out.printf("│%-4d│%-12s│%-6s│\n",
                    Food.getFood(),
                    Food.getRestaurant(),
                    Food.getPrice());
        }
        //System.out.printf("└────┴────────────┴──────┴──────┴──────┘\n");
    }
    /**
     * acquire food name
     *
     * @return food
     */
    public static String getFood() {
        System.out.print("please enter the food: ");
        return new Scanner(System.in).nextLine();
    }

    /**
     * acquire restaurant name
     *
     * @return restaurant
     */
    public static String getRestaurant() {
        System.out.print("please enter the restaurant: ");
        return new Scanner(System.in).nextLine();
    }
}

