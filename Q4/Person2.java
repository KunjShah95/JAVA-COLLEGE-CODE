import java.util.Scanner;

public class Person2 {
    String name;
    int age;
    double salary;

    public Person2(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Name: ");
        String name = sc.nextLine();
        System.out.println("Enter Age: ");
        int age = sc.nextInt();
        System.out.println("Enter Salary: ");
        double salary = sc.nextDouble();

        Person2 person1 = new Person2(name, age, salary);

        person1.display();

        sc.close();
    }
}