/**
 * @ClassName Food
 * @Description: TODO Food class
 * @Author: Fengyu Liao
 */
public class Food {
    private double price;
    private String Food;
    private String Restaurant;

    public Food(String Restaurant, String Food, double price){
        this.price = price;
        this.Food = Food;
        this.Restaurant = Restaurant;
    }
    public Food(double price, String Restaurant){
        this.price = price;
        this.Restaurant = Restaurant;
    }
    public Food() {
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public String getFood() { return Food;}
    public void setFood(String Food) {
        this.Food = Food;
    }

    public String getRestaurant() { return Restaurant;}
    public void setRestaurant(String Restaurant) {
        this.Restaurant = Restaurant;
    }

    @Override
    public String toString() {
        return "Food{" +
                "price=" + price +
                ", Food='" + Food + '\'' +
                ", Restaurant='" + Restaurant + '\'' +
                '}';
    }
}
