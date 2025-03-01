//Create a hierarchy of shapes using inheritance.
// Start with a base class Shape that has an enumerator Color (RED, GREEN, BLUE) and a method calculateArea()
// (which returns 0.0 in the base class).
// Create two concrete classes, Rectangle and Circle, that inherit from Shape.
public class ShapeTester {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(Shape.Color.RED, 5, 10);
        Shape circle = new Circle(Shape.Color.BLUE, 7);
        System.out.println("Rectangle area: " + rectangle.calculateArea() + " color: " + rectangle.getColor());
        System.out.println("Circle area: " + circle.calculateArea() + " color: " + circle.getColor());
    }
}