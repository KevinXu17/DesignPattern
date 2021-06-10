package AbstractFactoryPattern;

public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        AbstractFactory af = FactoryProducer.getFactory(true);
        Shape s = af.getShape("ROUNDEDSQUARE");
        s.draw();
    }
}
