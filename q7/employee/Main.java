package employee;

import java.util.Scanner;

class SalariedEmployee {
    private double salary;
    private double HRA;
    private double DA;
    private double grossSalary;
    private String name;
    
    public void input_data(Scanner sc) {
        System.out.print("Enter employee name: ");
        this.name = sc.nextLine();
        System.out.print("Enter basic salary: ");
        this.salary = sc.nextDouble();
    }
    
    public void allowance() {
        this.HRA = 0.10 * this.salary;
        this.DA = 0.08 * this.salary;
        this.grossSalary = this.salary + this.HRA + this.DA;
    }
    
    public void increment() {
        this.salary *= 1.10; // 10% increment
    }
    
    public void show_data() {
        System.out.println("Employee Name: " + this.name);
        System.out.println("Basic Salary: " + this.salary);
    }
    
    public double getSalary() {
        return salary;
    }
    
    public double getHRA() {
        return HRA;
    }
    
    public double getDA() {
        return DA;
    }
    
    public double getGrossSalary() {
        return grossSalary;
    }
}

public class Main {
	public static void main(String[] args) {
            try (Scanner sc = new Scanner(System.in)) {
                SalariedEmployee emp = new SalariedEmployee();
                emp.input_data(sc);
                emp.allowance();
                emp.increment();
                emp.show_data();
                System.out.printf("Updated Salary after increment: %.2f%n", emp.getSalary());
                System.out.printf("HRA: %.2f%n", emp.getHRA());
                System.out.printf("DA: %.2f%n", emp.getDA());
                System.out.printf("Gross Salary: %.2f%n", emp.getGrossSalary());
            }
	}
}