import java.util.*;
public class Number2 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number: ");
            int a = sc.nextInt();
            System.out.println("Enter a number: ");
            int b = sc.nextInt();
            System.out.println("Enter a number: ");
            int c = sc.nextInt();
                int max = a > b ? (a > c ? a : c) : (b > c ? b : c);
                System.out.println("The largest number is: " + max);
            }
        }
    }