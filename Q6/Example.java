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

    @Override
    public double area() {
        return 0.5 * base * height;
    }
}

public class Example {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the shape: ");
        String shape = sc.nextLine();
        double length, width, radius, base, height;
        switch (shape) {
            case "Rectangle" -> {
                System.out.println("Enter the length: ");
                length = sc.nextDouble();
                System.out.println("Enter the width: ");
                width = sc.nextDouble();
                Shape rectangle = new Rectangle(length, width);
                System.out.println("Area of rectangle: " + rectangle.area());
            }
            case "Circle" -> {
                System.out.println("Enter the radius: ");
                radius = sc.nextDouble();
                Shape circle = new Circle(radius);
                System.out.println("Area of circle: " + circle.area());
            }
            case "Triangle" -> {
                System.out.println("Enter the base: ");
                base = sc.nextDouble();
                System.out.println("Enter the height: ");
                height = sc.nextDouble();
                Shape triangle = new Triangle(base, height);
                System.out.println("Area of triangle: " + triangle.area());
            }
            default ->
                System.out.println("Invalid shape");
        }
    }
}
