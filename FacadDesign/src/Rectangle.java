/**
 * The Rectangle class represents a concrete implementation of the Shape interface,
 * specifically for drawing rectangles.
 *
 * @author shrajnashetty
 * @version 2.0
 */
public class Rectangle implements Shape {

    /**
     * The draw method is implemented to fulfill the contract defined by the Shape interface.
     * It prints a message indicating that a rectangle is being drawn.
     *
     * @return Null, as the implementation of the draw method in this class does not return any meaningful value.
     */
    @Override
    public String draw() {
        System.out.println("Rectangle::draw()");
        return null;
    }
}
