/**
 * The Shape interface defines a contract for objects that represent shapes.
 * Classes implementing this interface are expected to provide an implementation
 * for the draw method, specifying how the shape should be drawn.
 * 
 * This interface serves as a blueprint for various shape classes, allowing
 * them to be used interchangeably where a Shape is expected.
 * 
 * @author shrajnashetty
 * @version 1.0
 */
public interface Shape {

    /**
     * Draws the shape. Classes implementing this interface must provide
     * their own implementation of this method to define how the shape
     * is drawn.
     */
    void draw();
}
