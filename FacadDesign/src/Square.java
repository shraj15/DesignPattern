/**
 * The Square class represents a square shape and implements the Shape interface.
 * It provides a method to draw a square.
 *
 * @author shrajnashetty
 * @version 2.0
 */
public class Square implements Shape {

    /**
     * Overrides the draw method from the Shape interface to provide
     * the implementation for drawing a square.
     *
     * @return A string indicating the action of drawing a square.
     */
    @Override
    public String draw() {
        return "Square:draw()";
    }
}
