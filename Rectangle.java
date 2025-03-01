//Rectangle:
//private instance variables width and height.
//A constructor that takes Color, width, and height as arguments.
//Override calculateArea() to return the area of the rectangle.


public class Rectangle extends Shape {
    private double width;
    private double height;
    // Constructor
    public Rectangle(Color color, double width, double height) {
        super(color); //Calls constructor of shape
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height; // Area of a rectangle
    }
}
