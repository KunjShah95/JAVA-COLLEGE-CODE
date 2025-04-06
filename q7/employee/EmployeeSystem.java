package employee;

import java.util.Scanner;

// Employee class with basic employee information
class Employee {

    protected String name;
    protected int emp_num;
    protected char gender; // 'M' for Male, 'F' for Female

    // Default constructor
    public Employee() {
        name = "";
        emp_num = 0;
        gender = 'M';
    }

    // Method to input employee data
    public void input_data() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter employee name: ");
        name = scanner.nextLine();

        System.out.print("Enter employee number: ");
        emp_num = scanner.nextInt();

        System.out.print("Enter gender (M/F): ");
        gender = scanner.next().charAt(0);
    }

    // Method to display employee data
    public void show_data() {
        System.out.println("\nEmployee Details:");
        System.out.println("Name: " + name);
        System.out.println("Employee Number: " + emp_num);
        System.out.println("Gender: " + (gender == 'M' ? "Male" : "Female"));
    }
}

// SalariedEmployee subclass inheriting from Employee
class SalariedEmployee extends Employee {

    private double salary;
    private double hra; // House Rent Allowance
    private double da;  // Dearness Allowance

    // Default constructor
    public SalariedEmployee() {
        super();
        salary = 0.0;
        hra = 0.0;
        da = 0.0;
    }

    // Method to input salaried employee data
    @Override
    public void input_data() {
        super.input_data(); // Call parent class method to get basic details

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter basic salary: ");
        salary = scanner.nextDouble();

        // Calculate allowances immediately after setting salary
        allowance();
    }

    // Method to calculate allowances based on gender
    public void allowance() {
        // HRA calculation: 10% for females, 9% for males
        if (gender == 'F' || gender == 'f') {
            hra = 0.1 * salary;
        } else {
            hra = 0.09 * salary;
        }

        // DA calculation: 5% of salary for everyone
        da = 0.05 * salary;
    }

    // Method to apply increment to salary
    public void increment() {
        salary = salary + (0.01 * salary); // 1% increment
        // Recalculate allowances after increment
        allowance();
    }

    // Method to display salaried employee data
    @Override
    public void show_data() {
        super.show_data(); // Call parent class method to display basic details
        System.out.println("Basic Salary: Rs. " + salary);
        System.out.println("HRA: Rs. " + hra);
        System.out.println("DA: Rs. " + da);
        System.out.println("Gross Salary: Rs. " + (salary + hra + da));
    }

    // Method to get gross salary
    public double getGrossSalary() {
        return salary + hra + da;
    }
}

// Main class to test the implementation
public class EmployeeSystem {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Employee Management System");
            System.out.println("=========================");
            
            // Create a SalariedEmployee object
            SalariedEmployee emp = new SalariedEmployee();
            
            // Input employee details
            emp.input_data();
            
            // Display initial details
            System.out.println("\nInitial Employee Details:");
            emp.show_data();
            
            // Ask if increment should be applied
            System.out.print("\nDo you want to apply increment? (Y/N): ");
            char choice = scanner.next().charAt(0);
            
            if (choice == 'Y' || choice == 'y') {
                emp.increment();
                System.out.println("\nEmployee Details After Increment:");
                emp.show_data();
            }
            
            System.out.println("\nFinal Gross Salary: Rs. " + emp.getGrossSalary());
        }
    }
}
