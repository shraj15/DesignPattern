/**
 * The Rectangle class represents a concrete implementation of the Shape interface.
 * It defines the draw method to specify how a rectangle should be drawn.
 *
 * @author shrajnashetty
 * @version 1.0
 */
public class Rectangle implements Shape {

    /**
     * This method is implemented as part of the Shape interface. It prints a message
     * indicating that the draw operation for a rectangle is being performed.
     */
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
