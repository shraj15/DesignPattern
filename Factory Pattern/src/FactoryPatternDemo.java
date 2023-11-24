/**
 * This class demonstrates the Factory design pattern, which provides an interface
 * for creating objects in a super class, but allows subclasses to alter the type
 * of objects that will be created.
 *
 * The main method creates a ShapeFactory and uses it to create instances of
 * different shapes (Circle, Rectangle, Square) through the getShape method,
 * showcasing the flexibility of creating objects based on the provided input.
 *
 * @author shrajnashetty
 * @version 1.0
 */
public class FactoryPatternDemo {

    /**
     * The main method serves as the entry point for the Factory pattern demo.
     *
     * @param args Command-line arguments (not used in this demo)
     */
    public static void main(String[] args) {
        // Create a ShapeFactory object
        ShapeFactory shapeFactory = new ShapeFactory();

        // Create a Circle using the ShapeFactory
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();

        // Create a Rectangle using the ShapeFactory
        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        shape2.draw();

        // Create a Square using the ShapeFactory
        Shape shape3 = shapeFactory.getShape("SQUARE");
        shape3.draw();
    }
}
