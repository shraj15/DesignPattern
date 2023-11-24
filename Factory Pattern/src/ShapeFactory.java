/**
 * The ShapeFactory class is responsible for creating instances of different
 * shapes based on the provided shape type. It follows a simple factory pattern
 * where the creation of objects is delegated to subclasses.
 * 
 * This class contains a method, getShape, that takes a shapeType as a parameter
 * and returns an instance of the corresponding shape class. If the shapeType is
 * not recognized, it returns null.
 * 
 * @author shrajnashetty
 * @version 1.0
 */
public class ShapeFactory {

    /**
     * The getShape method creates and returns an instance of the specified shape
     * type. If the shapeType is null or not recognized, it returns null.
     * 
     * @param shapeType A string representing the type of shape to be created
     * @return An instance of the corresponding shape class or null if the shapeType
     *         is not recognized
     */
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }

        // If the shapeType is not recognized, return null
        return null;
    }
}
