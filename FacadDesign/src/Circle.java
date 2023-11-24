/**
 * The Circle class implements the Shape interface and represents a circle shape.
 *
 * @author shrajnashetty
 * @version 2.0
 */
public class Circle implements Shape {

    /**
     * This method overrides the draw method declared in the Shape interface.
     * It prints a message indicating that the circle is being drawn.
     *
     * @return Always returns null, as it is not specified to return any meaningful value.
     */
    @Override
    public String draw() {
        System.out.println("Circle::draw()");
        return null;
    }
}
