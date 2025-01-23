//nested if else
import java.util.*;
public class number{
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number: ");
            int a = sc.nextInt();
            System.out.println("Enter a number: ");
            int b = sc.nextInt();
            System.out.println("Enter a number: ");
            int c = sc.nextInt();
            if (a > b && a > c) {
                System.out.println(a + " is the largest number");
            } else if (b > a && b > c) {
                System.out.println(b + " is the largest number");
            } else {
                System.out.println(c + " is the largest number");
            }
        }
    }
}