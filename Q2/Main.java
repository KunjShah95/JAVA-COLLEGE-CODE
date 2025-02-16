import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Asking user for the number of elements
        try (Scanner scanner = new Scanner(System.in)) {
            // Asking user for the number of elements
            System.out.print("Enter the number of elements: ");
            int length = scanner.nextInt();
            
            int[] arr = new int[length];
            int sum = 0;
            
            // Taking input from user
            System.out.println("Enter " + length + " numbers:");
            for (int i = 0; i < length; i++) {
                arr[i] = scanner.nextInt();
                sum += arr[i];
            }
            
            // Calculating the average
            double average = (double) sum / length;
            
            // Displaying the result
            System.out.println("Average of the array: " + average);
        }
    }
}
