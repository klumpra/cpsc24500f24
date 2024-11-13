public class Circle extends Shape {
    private double radius;
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        if (radius < 0) {
            this.radius = 0;
        } else {
            this.radius = radius;
        }
    }
    public Circle() {
        this("circle",0,0,0);
    }
    public Circle(String name, double x, double y, double radius) {
        super(name,x,y);
        setRadius(radius);
    }
    @Override
    public String toString() {
        return String.format("%s\t%.2f",super.toString(),radius);
    }
    @Override
    public String getType() {
        return "circle";
    }
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
    @Override
    public double calculatePerimeter() {
        return 2* Math.PI * radius;
    }
}
