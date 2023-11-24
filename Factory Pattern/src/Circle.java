/**
 * The Circle class represents a concrete implementation of the Shape interface.
 * It is capable of drawing a circle.
 *
 * This class includes author information and version details.
 *
 * @author shrajnashetty
 * @version 1.0
 */
public class Circle implements Shape {

    /**
     * This method implements the draw() method defined in the Shape interface.
     * It prints a message indicating that the draw() method for a circle is being executed.
     */
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
