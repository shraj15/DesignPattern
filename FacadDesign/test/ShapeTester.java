
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * This class, ShapeTester, is responsible for testing the functionality of the
 * ShapeMaker class and its interactions with the individual shape-drawing classes.
 *
 * The tests include checking whether the draw method of each shape class (Circle,
 * Rectangle, and Square) produces the expected output when called through the
 * ShapeMaker class.
 *
 * @author shrajnashetty
 * @version 2.0
 */
public class ShapeTester {

    /**
     * Default constructor for ShapeTester.
     */
    public ShapeTester() {
    }

    // Create an instance of ShapeMaker to use its methods for testing
    ShapeMaker shapeMaker = new ShapeMaker();

    /**
     * Test method for verifying the functionality of drawing circles using ShapeMaker.
     */
    @Test
    public void testingCircle() {
        // Create an instance of Circle
        Circle cl = new Circle();

        // Assert that the draw method of Circle produces the expected output from ShapeMaker
        assertEquals(cl.draw(), shapeMaker.drawCircle());
    }

    /**
     * Test method for verifying the functionality of drawing rectangles using ShapeMaker.
     */
    @Test
    public void testingRectangle() {
        // Create an instance of Rectangle
        Rectangle rect = new Rectangle();

        // Assert that the draw method of Rectangle produces the expected output from ShapeMaker
        assertEquals(rect.draw(), shapeMaker.drawRectangle());
    }

    /**
     * Test method for verifying the functionality of drawing squares using ShapeMaker.
     */
    @Test
    public void testingSquare() {
        // Create an instance of Square
        Square sq = new Square();

        // Assert that the draw method of Square produces the expected output from ShapeMaker
        assertEquals(sq.draw(), shapeMaker.drawSquare());
    }
}
