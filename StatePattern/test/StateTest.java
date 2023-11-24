import org.junit.Test;
import static org.junit.Assert.*;

/**
 * This class contains JUnit tests for the State class, specifically testing
 * the behavior of a Rover object in different states.
 *
 * @author shrajnashetty
 * @version 1.0
 */
public class StateTest {

    // Creating a Rover object for testing
    Rover r = new Rover();

    /**
     * Test case to validate the behavior of pressing the right pedal of the Rover.
     * The Rover should transition between states based on the pedal press.
     */
    @Test
    public void testPressRightPedal() {

        // Initially, the Rover is expected to be at rest
        assertEquals("At Rest", r.currentState.name);

        // Pressing the right pedal with a value of 2 should not change the state
        r.pressRightPedal(2);
        assertEquals("At Rest", r.currentState.name);

        // Pressing the right pedal with a value of 1 should transition the state to "Move Forward"
        r.pressRightPedal(1);
        assertEquals("Move Forward", r.currentState.name);
    }

    /**
     * Test case to validate the behavior of printing the current state and substate of the Rover.
     * This test is currently empty and needs to be implemented.
     */
    @Test
    public void testPrintStateAndSubState() {
        // TODO: Implement test case for printing state and substate
    }

    /**
     * Test case to be implemented if there are any main method-specific functionalities.
     * This test is currently empty and needs to be implemented.
     */
    @Test
    public void testMain() {
        // TODO: Implement test case for main method functionalities
    }
}
