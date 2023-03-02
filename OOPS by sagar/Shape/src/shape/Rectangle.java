package shape;

public class Rectangle extends Shape {

    private double length;
    private double breadth;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getBreadth() {
        return breadth;
    }

    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    void area() {
        System.out.println("Area of Reactangle : " + length * breadth);
    }

    @Override
    void perimeter() {
        System.out.println("Perimeter of Reactangle : " + 2 * (length + breadth));
    }
}
