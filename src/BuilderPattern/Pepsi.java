package BuilderPattern;

public class Pepsi extends ColdDrink {
    @Override
    public String name() {
        return "Pepsi :: cold drink";
    }

    @Override
    public float price() {
        return 0.99f;
    }
}
