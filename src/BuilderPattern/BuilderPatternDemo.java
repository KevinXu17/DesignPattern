package BuilderPattern;

public class BuilderPatternDemo {
    public static void main(String[] args) {
        MealBuilder mb = new MealBuilder();
        Meal nv = mb.prepareNonVegMeal();
        Meal vm = mb.prepareVegMeal();
        nv.showItems();
    }
}
