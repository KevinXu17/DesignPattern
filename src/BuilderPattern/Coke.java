package BuilderPattern;

public class Coke extends ColdDrink {
    @Override
    public String name() {
        return "coke :: cold drink";
    }

    @Override
    public float price() {
        return 0.99f;
    }
}
