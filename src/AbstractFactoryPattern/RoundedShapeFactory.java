package AbstractFactoryPattern;

public class RoundedShapeFactory extends AbstractFactory {

    private  final String ROUNDEDRECTANGLE = "ROUNDEDRECTANGLE";
    private  final String ROUNDEDSQUARE = "ROUNDEDSQUARE";

    @Override
    Shape getShape(String shapeType) {
        String type = shapeType.toUpperCase();
        if (type.equals(ROUNDEDRECTANGLE)) return new RoundedRectangle();
        else if (type.equals(ROUNDEDSQUARE)) return new RounderSquare();
        else return null;
    }
}
