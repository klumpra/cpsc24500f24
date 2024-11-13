public class Rectangle extends Shape {
    private double width;
    private double length;
    public double getWidth() {
        return width;
    }
    public double getLength() {
        return length;
    }
    public void setWidth(double width) {
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
    }
    public void setLength(double length) {
        if (length < 0) {
            this.length = 0;
        } else {
            this.length = length;
        }
    }
    public Rectangle() {
        this("",0,0,0,0);
    }
    public Rectangle(String name, double x, double y, double length, double width) {
        super(name,x,y);
        setLength(length);
        setWidth(width);
    }
    @Override
    public double calculateArea() {
        return length * width;
    }
    @Override
    public double calculatePerimeter() {
        return 2*(length+width);
    }
    @Override
    public String getType() {
        return "rectangle";
    }
    @Override
    public String toString() {
        return String.format("%s\t%.2f\t%.2f",super.toString(),length,width);
    }
}
