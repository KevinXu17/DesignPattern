package AbstractFactoryPattern;

public class ShapeFactory extends AbstractFactory {

    private final String RECTANGLE = "RECTANGLE";
    private final String SQUARE = "SQUARE";

    @Override
    Shape getShape(String shapeType) {
        String type = shapeType.toUpperCase();
        if (type.equals(RECTANGLE)) return new Rectangle();
        else if (type.equals(SQUARE)) return new Square();
        else return null;
    }
}
