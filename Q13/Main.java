import java.util.*;

public class Main{
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a string:");
            String input = scanner.nextLine();
            
            System.out.print("Enter the character to count: ");
            char charToCount = scanner.next().charAt(0);
            
            int originalLength = input.length();
            String newString = input.replace(String.valueOf(charToCount), "");
            int newLength = newString.length();
            
            int count = originalLength - newLength;
            System.out.println("The character '" + charToCount + "' appears " + count + " times in the string.");
        }
    }
    }