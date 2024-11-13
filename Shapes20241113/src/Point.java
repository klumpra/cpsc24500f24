public class Point {
    private double x;
    private double y;
    public double getX() {
        return x;
    }
    public void setX(double x) {
        this.x = x;
    }
    public double getY() {
        return y;
    }
    public void setY(double y) {
        this.y = y;
    }
    public Point() {
        this(0,0);
    }   
    public Point(double x, double y) {
        setX(x);
        setY(y);
    } 
    @Override
    public String toString() {
        return String.format("%.2f\t%.2f",x,y);
    }
}
