/**
 * The Square class represents a concrete implementation of the Shape interface.
 * It is capable of drawing a square.
 * 
 * The class includes the author information and version details.
 * 
 * @author shrajnashetty
 * @version 1.0
 */
public class Square implements Shape {

    /**
     * The draw method is implemented as required by the Shape interface.
     * It prints a message indicating that the draw method for a square is executed.
     */
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
