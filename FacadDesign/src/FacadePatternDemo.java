/**
 * This class serves as the main entry point for the Facade pattern demo.
 * It demonstrates the use of a simplified interface, provided by the ShapeMaker class,
 * to draw different shapes using a subsystem of classes (Circle, Rectangle, Square).
 *
 * @author shrajnashetty
 * @version 2.0
 */
public class FacadePatternDemo {

    /**
     * The main method initializes a ShapeMaker object and uses its simplified interface
     * to draw a circle, rectangle, and square.
     *
     * @param args Command-line arguments (not used in this demo)
     */
    public static void main(String[] args) {

        // Create a ShapeMaker object, which acts as the facade
        ShapeMaker shapeMaker = new ShapeMaker();

        // Draw a circle using the simplified interface provided by ShapeMaker
        shapeMaker.drawCircle();

        // Draw a rectangle using the simplified interface provided by ShapeMaker
        shapeMaker.drawRectangle();

        // Draw a square using the simplified interface provided by ShapeMaker
        shapeMaker.drawSquare();
    }
}
