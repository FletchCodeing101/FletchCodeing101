//Circle:
//A private instance variable radius.
//A constructor that takes Color and radius as arguments.
//Override calculateArea() to return the area of the circle.

public class Circle extends Shape {
    private double radius;
    // Constructor
    public Circle(Color color, double radius) {
        super(color); // Calls constructor
        this.radius = radius;
    }
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius; // Area of a circle formula
    }
}
