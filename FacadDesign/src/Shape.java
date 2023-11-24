/**
 * The Shape interface represents a common interface for various shapes. 
 * Classes that implement this interface are expected to provide a "draw" 
 * method, allowing them to define how the specific shape should be drawn.
 * 
 * This interface follows the contract of abstraction for shapes, allowing 
 * different shapes to be treated uniformly through the common "draw" method.
 * 
 * @author shrajnashetty
 * @version 2.0
 */
public interface Shape {

    /**
     * Draws the specific shape. Implementing classes should define the 
     * drawing behavior for the respective shape.
     * 
     * @return A string representation of the drawing action.
     */
    String draw();
}
