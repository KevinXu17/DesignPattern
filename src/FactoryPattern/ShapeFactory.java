package FactoryPattern;

public class ShapeFactory {
    private final  String CIRCLE = "CIRCLE";
    private final  String RECTANGLE = "RECTANGLE";
    private final  String SQUARE = "SQUARE";


    public Shape getShaple(String shapeType) {
        if (shapeType == null) return null;
        switch (shapeType.toUpperCase()) {
            case CIRCLE: return new Circle();
            case RECTANGLE: return new Rectangle();
            case SQUARE: return new Square();
            default:
                return null;
        }
    }
}
