import java.util.Scanner;

class Employee {
    protected String name;
    protected int empNumber;
    protected char gender;

    public Employee(String name, int empNumber, char gender) {
        this.name = name;
        this.empNumber = empNumber;
        this.gender = gender;
    }

    public void showData() {
        System.out.println("Employee Number: " + empNumber);
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
    }
}

class SalariedEmployee extends Employee {
    private double salary;

    public SalariedEmployee(String name, int empNumber, char gender, double salary) {
        super(name, empNumber, gender);
        this.salary = salary;
    }

    public double calculateAllowance() {
        double hra = (gender == 'F' || gender == 'f') ? 0.1 * salary : 0.09 * salary;
        double da = 0.05 * salary;
        return hra + da;
    }

    public void incrementSalary() {
        salary += 0.1 * salary;
    }

    public void showSalaryDetails() {
        showData();
        System.out.println("Basic Salary: " + salary);
        System.out.println("Total Allowance: " + calculateAllowance());
        System.out.println("Gross Salary: " + (salary + calculateAllowance()));
        System.out.println("------------------------------");
    }
}

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the number of employees: ");
            int numEmployees = scanner.nextInt();
            scanner.nextLine();

            SalariedEmployee[] employees = new SalariedEmployee[numEmployees];

            for (int i = 0; i < numEmployees; i++) {
                System.out.println("Enter details for Employee " + (i + 1) + ":");
                System.out.print("Name: ");
                String name = scanner.nextLine();
                System.out.print("Employee Number: ");
                int empNumber = scanner.nextInt();
                System.out.print("Gender (M/F): ");
                char gender = scanner.next().charAt(0);
                System.out.print("Basic Salary: ");
                double salary = scanner.nextDouble();
                scanner.nextLine();

                employees[i] = new SalariedEmployee(name, empNumber, gender, salary);
            }

            System.out.println("\nEmployee Salary Details:");
            for (SalariedEmployee emp : employees) {
                emp.incrementSalary();
                emp.showSalaryDetails();
            }
        }
    }
}