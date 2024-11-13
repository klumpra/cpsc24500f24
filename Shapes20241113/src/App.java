import java.util.ArrayList;
public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Shape> shapes = new ArrayList<Shape>();
        shapes.add(new Circle("cir1",5,7.2,13.4));
        shapes.add(new Circle("cir2",7.2,1.8,8.4));
        shapes.add(new Rectangle("rec1",8.4,3.6,9.8,11.4));
        ShapePrinter.printShapes(shapes);  
        System.out.println(Circle.count);
    }
}
