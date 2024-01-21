package rectangle;

public class Rectangle {
    private double length;
    private double width;

    // Constructor with both length and width parameters
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Constructor with a single parameter to create a square
    public Rectangle(double side) {
        this.length = side;
        this.width = side;
    }

    // Getter methods
    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    // Example of how to use the constructors to create Rectangle objects
    public static void main(String[] args) {
        // Creating a rectangle with specific length and width
        Rectangle rectangle1 = new Rectangle(5.0, 8.0);
        System.out.println("Rectangle 1 - Length: " + rectangle1.getLength() + ", Width: " + rectangle1.getWidth());

        // Creating a square with a single parameter (side length)
        Rectangle square = new Rectangle(4.0);
        System.out.println("Square - Side Length: " + square.getLength() + ", Width: " + square.getWidth());
    }
}

