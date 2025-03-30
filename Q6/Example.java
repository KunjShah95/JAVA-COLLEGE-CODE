import java.util.*;

abstract class Shape {
    public abstract double area();
}

class Rectangle extends Shape {
    private final double length;
    private final double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public static Rectangle create(double length, double width) {
        return new Rectangle(length, width);
    }

    @Override
    public double area() {
        return length * width;
    }
}

class Circle extends Shape {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    
    public static Circle create(double radius) {
        return new Circle(radius);
    }
    
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

class Triangle extends Shape {
    private final double base;
    private final double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
    
    public static Triangle create(double base, double height) {
        return new Triangle(base, height);
    }

    @Override
    public double area() {
        return 0.5 * base * height;
    }
}

public class Example {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the shape (Rectangle, Circle, Triangle): ");
            String shape = sc.nextLine();
            double length, width, radius, base, height;
            
            switch (shape) {
                case "Rectangle" -> {
                    System.out.println("Enter the length: ");
                    length = sc.nextDouble();
                    System.out.println("Enter the width: ");
                    width = sc.nextDouble();
                    Shape rectangle = Rectangle.create(length, width);
                    System.out.println("Area of rectangle: " + rectangle.area());
                }
                case "Circle" -> {
                    System.out.println("Enter the radius: ");
                    radius = sc.nextDouble();
                    Shape circle = Circle.create(radius);
                    System.out.println("Area of circle: " + circle.area());
                }
                case "Triangle" -> {
                    System.out.println("Enter the base: ");
                    base = sc.nextDouble();
                    System.out.println("Enter the height: ");
                    height = sc.nextDouble();
                    Shape triangle = Triangle.create(base, height);
                    System.out.println("Area of triangle: " + triangle.area());
                }
                default ->
                    System.out.println("Invalid shape");
            }
        }
    }
}
