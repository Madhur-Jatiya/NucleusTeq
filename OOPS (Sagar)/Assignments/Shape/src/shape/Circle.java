package shape;

import static java.lang.Math.PI;

public class Circle extends Shape {

    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    void area() {
        System.out.println("Area of Circle : " + PI * radius * radius);
    }

    @Override
    void perimeter() {
        System.out.println("Perimeter of Circle : " + 2 * PI * radius);
    }

}
