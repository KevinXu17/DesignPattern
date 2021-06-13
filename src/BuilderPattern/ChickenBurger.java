package BuilderPattern;

public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "Chicken burger :: burger";
    }

    @Override
    public float price() {
        return 5.99f;
    }
}
