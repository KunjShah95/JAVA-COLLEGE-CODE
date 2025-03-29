interface Shape2D{
    double getArea();
}

class Point3D{
    private final double x;
    private final double y;
    private final double z;

    public Point3D(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public double getZ(){
        return z;
    }
    @Override
    public String toString(){
        return "(" + x + "," + y + "," + z +")";
    }
}

abstract class Shape{
    public abstract void display();
}

class Circle extends Shape implements Shape2D{
    private final double radius;
    private final Point3D center;

    public Circle(double radius, Point3D center){
        this.radius = radius;
        this.center = center;
    }

    @Override
    public double getArea(){
        return Math.PI * radius * radius;
    }

    @Override
    public void display(){
        System.out.println("Circle with radius " + radius + " and center at " + center);
    }
    public double getRadius(){
        return radius;
    }
    public Point3D getCenter(){
        return center;
    }
}

public class Shapes{
    public static void main(String[] args){
        Point3D center = new Point3D(0, 0, 0);

        Circle circle = new Circle(5.0, center);

        System.out.println("Circle Information:");
        circle.display();

        System.out.println("\nArea using interface method: " + circle.getArea());
        Shape shape = circle;
        System.out.println("\nUsing Shape reference:");
        shape.display();
        
        Shape2D shape2D = circle;
        System.out.println("\nArea using Shape2D interface: " + shape2D.getArea());
    }
}