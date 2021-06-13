package BuilderPattern;

public class VegBurger extends Burger {
    @Override
    public String name() {
        return "Veg Burger :: Burger";
    }

    @Override
    public float price() {
        return 6.99f;
    }
}
