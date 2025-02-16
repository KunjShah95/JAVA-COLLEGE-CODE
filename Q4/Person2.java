import java.util.Scanner;

public class Person2 {
    String name;
    int age;
    double salary;

    // Constructor to initialize instance variables
    public Person2(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    // Method to display instance variables
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Reading user input
        System.out.println("Enter Name: ");
        String name = sc.nextLine();
        System.out.println("Enter Age: ");
        int age = sc.nextInt();
        System.out.println("Enter Salary: ");
        double salary = sc.nextDouble();

        // Creating a Person object
        Person2 person1 = new Person2(name, age, salary);

        // Displaying the instance variables
        person1.display();

        sc.close();
    }
}
