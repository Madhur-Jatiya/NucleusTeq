package shape;

public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        circle.area();
        circle.perimeter();
        
        Rectangle rectangle = new Rectangle(10,30);
        rectangle.area();
        rectangle.perimeter();
    }
}
