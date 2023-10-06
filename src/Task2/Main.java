package Task2;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

    Cafe cafe = new Cafe();

    cafe.loadMenuData();
    ArrayList<String> coffeeMenu = cafe.getCoffeeMenu();
    for (String coffeeName : coffeeMenu) {
        System.out.println(coffeeName);
        }
    System.out.println("Current Directory: " + System.getProperty("user.dir"));

    }
}