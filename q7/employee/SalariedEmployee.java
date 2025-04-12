package employee;
import java.util.Scanner;
public class SalariedEmployee extends Employee {
	private double salary;
	private double hra;
	private double da;
	
	@Override
	public void input_data(Scanner sc) {
		super.input_data(sc);
		System.out.print("Enter base salary: ");
		salary = Double.parseDouble(sc.nextLine());
	}
	
	public void allowance() {
		if (gender.equals("female")) {
			hra = 0.10 * salary;
		} else {
			hra = 0.09 * salary;
		}
		da = 0.05 * salary;
	}
	
	public void increment() {
		salary = salary + 0.01 * salary;
	}
	
	public double getGrossSalary() {
		return salary + hra + da;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public double getHRA() {
		return hra;
	}
	
	public double getDA() {
		return da;
	}
}