package employee;
import java.util.Scanner;
public class Employee {
	protected String name;
	protected int emp_num;
	protected String gender;
	
	public void input_data(Scanner sc) {
		System.out.print("Enter name: ");
		name = sc.nextLine();
		System.out.print("Enter employee number: ");
		emp_num = Integer.parseInt(sc.nextLine());
		System.out.print("Enter gender (male/female): ");
		gender = sc.nextLine().toLowerCase();
	}
	
	public void show_data() {
		System.out.println("\nEmployee Details:");
		System.out.println("Name: " + name);
		System.out.println("Employee Number: " + emp_num);
		System.out.println("Gender: " + gender);
	}
}