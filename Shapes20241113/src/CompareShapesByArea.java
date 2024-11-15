import java.util.Comparator;
public class CompareShapesByArea implements Comparator<Shape> {
    @Override
    public int compare(Shape s1, Shape s2) {
        double area1 = s1.calculateArea();
        double area2 = s2.calculateArea();
        if (area1 < area2) {
            return -1;  // s1 had a lesser area than s2
        } else if (area1 == area2) {
            return 0;  // equal area
        } else {
            return 1;  // s1 had a greater area than s2
        }
    }
}
