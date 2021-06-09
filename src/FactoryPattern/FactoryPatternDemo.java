package FactoryPattern;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        String inputShape = "circle";
        Shape shape = shapeFactory.getShaple(inputShape);
        shape.draw();
    }
}
