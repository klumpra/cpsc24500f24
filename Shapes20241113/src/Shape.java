public abstract class Shape {
    private String name;
    private Point origin;
    public static int count = 0;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Point getOrigin() {
        return origin;
    }
    public double getOriginX() {
        return origin.getX();
    }
    public double getOriginY() {
        return origin.getY();
    }
    public void setOrigin(Point pt) {
        origin = pt;
    }
    public void setOrigin(double x, double y) {
        origin = new Point(x,y);
    }
    public Shape() {
        this("shape",0,0);
    }
    public Shape(String name, Point origin) {
        setOrigin(origin);
        setName(name);
        count = count + 1;
    }
    public Shape(String name, double x, double y) {
        setOrigin(x,y);
        setName(name);
        count = count + 1;
    }
    public abstract String getType();
    @Override
    public String toString() {
        return String.format("%s\t%s\t%s",getType(),name,origin.toString());
    }
    public abstract double calculateArea();
    public abstract double calculatePerimeter();
}
