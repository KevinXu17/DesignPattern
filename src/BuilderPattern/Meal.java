package BuilderPattern;

import java.util.ArrayList;

public class Meal {
    private ArrayList<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public float getCost() {
        float totalCost = 0;
        for (Item item : items) {
            totalCost += item.price();
        }
        return totalCost;
    }

    public void showItems() {
        for (Item item : items) {
            System.out.println("Name : " + item.name());
            System.out.println("Price : " + item.price());
            System.out.println("Packing : " + item.packing().pack());
        }
    }
}
