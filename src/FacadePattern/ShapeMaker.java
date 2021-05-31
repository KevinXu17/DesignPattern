package FacadePattern;

public class ShapeMaker {
    private Triangle triangle;
    private Rectangle rectangle;
    private Circle circle;

    public ShapeMaker() {
        this.triangle = new Triangle();
        this.rectangle = new Rectangle();
        this.circle = new Circle();
    }

    public void drawCircle() {
        circle.draw();
    }

    public void drawTriangle() {
        triangle.draw();
    }

    public void drawRectangle() {
        rectangle.draw();
    }

}
