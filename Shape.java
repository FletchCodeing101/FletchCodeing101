// Shape:
//An enum Color with values RED, GREEN, and BLUE.
//A protected Color instance variable.
//protected constructor that initializes the color.
//A method public double calculateArea() that returns 0.0.


public abstract class Shape {
    public enum Color {
        RED, GREEN, BLUE
    }

    protected Color color;

    protected Shape(Color color) {
        this.color = color;
    }

    // Method
    public double calculateArea() {
        return 0.0;
    }


    public Color getColor() {
        return color;
    }
}
