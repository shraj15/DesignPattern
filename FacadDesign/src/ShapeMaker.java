/*
 * This class represents a ShapeMaker that utilizes the Shape interface
 * and acts as a facade to draw different shapes (circle, rectangle, square).
 *
 * @author shrajnashetty
 * @version 2.0
 */
public class ShapeMaker {

    // Instances of classes implementing the Shape interface
    private Shape circle;
    private Shape rectangle;
    private Shape square;

    /*
     * Constructor for the ShapeMaker class. Initializes instances of
     * Circle, Rectangle, and Square classes.
     */
    public ShapeMaker() {
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }

    /*
     * Draws a circle using the draw method of the Circle class.
     *
     * @return A string representing the result of drawing a circle.
     */
    public String drawCircle() {
       return circle.draw();
    }

    /*
     * Draws a rectangle using the draw method of the Rectangle class.
     *
     * @return A string representing the result of drawing a rectangle.
     */
    public String drawRectangle() {
       return rectangle.draw();
    }

    /*
     * Draws a square using the draw method of the Square class.
     *
     * @return A string representing the result of drawing a square.
     */
    public String drawSquare() {
        return square.draw();
    }
   
}
