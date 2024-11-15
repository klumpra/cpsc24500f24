import java.util.ArrayList;
import java.util.Collections;
public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Shape> shapes = new ArrayList<Shape>();
        shapes.add(new Circle("one",5,3,8));
        shapes.add(new Rectangle("two",4,8,2,9));
        shapes.add(new Circle("three",10,3,2));
        ShapePrinter.printShapes(shapes);  
        System.out.println("Now sort by name ...");
        Collections.sort(shapes);
        ShapePrinter.printShapes(shapes);
        System.out.println("Now compare by area ...");
        Collections.sort(shapes, new CompareShapesByArea());
        ShapePrinter.printShapes(shapes);
    }
}
