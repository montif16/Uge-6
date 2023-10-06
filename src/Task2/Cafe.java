package Task2;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class Cafe {

    private ArrayList<String> coffeeMenu = new ArrayList<>();

    public void loadMenuData() {
        try {
            File file = new File("Coffees.txt");

            Scanner scan = new Scanner(file);

            while (scan.hasNextLine()) {
                String coffeeName = scan.nextLine();
                coffeeMenu.add(coffeeName);
            }

        scan.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found. Check path and filename");
        }
    }
    public ArrayList<String> getCoffeeMenu() {
        return coffeeMenu;
    }
}