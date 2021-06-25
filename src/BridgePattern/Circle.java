package BridgePattern;

public class Circle extends Shape {
    Circle(Color color) {
        super(color);
    }

    @Override
    void draw() {
        System.out.println("Draw ::  Circle");
        color.drawColor();
    }
}
