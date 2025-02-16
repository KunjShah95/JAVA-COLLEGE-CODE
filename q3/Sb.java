import java.util.Scanner;

public class Sb {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            StringBuffer sb = new StringBuffer("HelloWorld");
            
            System.out.print("Enter the string to append: ");
            String appendString = scanner.nextLine();
            
            System.out.print("Enter the position to append the string: ");
            int position = scanner.nextInt();
            
            sb.insert(position, appendString);
            
            System.out.println("Modified String: " + sb.toString());
            
            System.out.println("Reversed String: " + sb.reverse().toString());
        }
    }
}