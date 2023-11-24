/**
 * The SingletonDemo class serves as a demonstration of the Singleton design pattern.
 * It contains the main method where an instance of the SingleObject class is obtained
 * and its showMessage method is called.
 * 
 * @author shrajnashetty
 * @version 1.0
 */
public class SingletonDemo {

    /**
     * The main method of the program.
     * It demonstrates the usage of the Singleton pattern by obtaining an instance
     * of the SingleObject class and invoking its showMessage method.
     * 
     * @param args Command-line arguments (not used in this example).
     */
    public static void main(String[] args) {

        // Obtain an instance of SingleObject using the getInstance() method
        SingleObject object = SingleObject.getInstance();

        // Call the showMessage method of the SingleObject instance
        object.showMessage();
    }
}
