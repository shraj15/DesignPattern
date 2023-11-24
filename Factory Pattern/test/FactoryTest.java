/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * This class provides JUnit tests for the Factory design pattern implementation.
 * It tests the functionality of the ShapeFactory class by verifying that the
 * correct instances of shapes (Circle, Rectangle, Square) are returned based on
 * the input provided to the getShape method.
 *
 * @author shrajnashetty
 * @version 1.0
 * 
 */
public class FactoryTest {
    
    public FactoryTest() {
    }
    
    // Create an instance of ShapeFactory for testing
    ShapeFactory sh = new ShapeFactory();

    /**
     * Test method to validate if the instance of Circle is returned when the input is "circle".
     */
    @Test
    public void testCircle() {
        assertTrue(sh.getShape("circle") instanceof Circle);
    }

    /**
     * Test method to validate if the instance of Rectangle is returned when the input is "rectangle".
     */
    @Test
    public void testRectangle() {
        assertTrue(sh.getShape("rectangle") instanceof Rectangle);
    }

    /**
     * Test method to validate if the instance of Square is returned when the input is "square".
     */
    @Test
    public void testSquare() {
        assertTrue(sh.getShape("square") instanceof Square);
    }
        
}
