import java.util.Scanner;

public class Person1 {
    String name;
    int age;
    double salary;

    void setName(String name) {
        this.name = name;
    }

    void setAge(int age) {
        this.age = age;
    }

    void setSalary(double salary) {
        this.salary = salary;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter Name: ");
            String name = sc.nextLine();
            System.out.println("Enter Age: ");
            int age = sc.nextInt();
            System.out.println("Enter Salary: ");
            double salary = sc.nextDouble();
            
            Person1 person1 = new Person1();
            person1.setName(name);
            person1.setAge(age);
            person1.setSalary(salary);
            person1.display();
        }
    }
}
