import java.util.Scanner;

public class EmployeeSalary {
    String employeeCode, name, designation;
    double basePay, hra, da, totalSalary;

    EmployeeSalary(Scanner sc) {
        employeeCode = sc.nextLine();
        name = sc.nextLine();
        designation = sc.nextLine();
        basePay = sc.nextDouble();
        sc.nextLine();
        calculateSalary();
    }

    void calculateSalary() {
        hra = (basePay * 10) / 100;
        da = (basePay * 45) / 100;
        totalSalary = basePay + hra + da;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Employee Code: " + employeeCode);
        System.out.println("Designation: " + designation);
        System.out.println("HRA: " + hra);
        System.out.println("DA: " + da);
        System.out.println("Total Salary: " + totalSalary);
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        EmployeeSalary e1 = new EmployeeSalary(sc);
        EmployeeSalary e2 = new EmployeeSalary(sc);
        EmployeeSalary e3 = new EmployeeSalary(sc);

        System.out.println("\nEmployee Details:");
        e1.display();
        e2.display();
        e3.display();

        sc.close();
    }
}
