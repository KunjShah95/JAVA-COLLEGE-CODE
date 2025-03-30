import java.util.Scanner;

// 3D Point class
class Point3D {
    private final double x, y, z;
    
    public Point3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
    public double getX() { return x; }
    public double getY() { return y; }
    public double getZ() { return z; }
    
    @Override
    public String toString() {
        return "(" + x + ", " + y + ", " + z + ")";
    }
}

// Shape interface
interface Shape {
    void display();
}

// 2D Shape interface
interface Shape2D extends Shape {
    double getArea();
}

// Circle class
class Circle implements Shape2D {
    private final double radius;
    private final  Point3D center;
    
    public Circle(double radius, Point3D center) {
        this.radius = radius;
        this.center = center;
    }
    
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
    
    @Override
    public void display() {
        System.out.println("Circle with radius " + radius);
        System.out.println("Center at " + center);
    }
}

public class Shapes {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter coordinates for the center of the circle:");
            System.out.print("X coordinate: ");
            double x = scanner.nextDouble();
            System.out.print("Y coordinate: ");
            double y = scanner.nextDouble();
            System.out.print("Z coordinate: ");
            double z = scanner.nextDouble();
            
            Point3D center = new Point3D(x, y, z);
            
            System.out.print("Enter radius of the circle: ");
            double radius = scanner.nextDouble();
            
            Circle circle = new Circle(radius, center);
            
            System.out.println("\nCircle Information:");
            circle.display();
            
            System.out.println("\nArea using interface method: " + circle.getArea());
            Shape shape = circle;
            System.out.println("\nUsing Shape reference:");
            shape.display();
            
            Shape2D shape2D = circle;
            System.out.println("\nArea using Shape2D interface: " + shape2D.getArea());
        }
    }
}
