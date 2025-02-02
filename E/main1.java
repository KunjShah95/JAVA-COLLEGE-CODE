import java.util.*;

public class main1 {
    public static void main(String[] args) {
        int t;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();

        for (int test = 0; test < t; test++) {
            int n;
            Scanner sc1 = new Scanner(System.in);
            // upper part
            n = sc1.nextInt();
            for (int i = 0; i < n; i++) {
                int stars = 2 * i + 1;
                for (int j = 0; j < n - i - 1; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < stars; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            // lower part
            for (int i = n - 2; i >= 0; i--) {
                int stars = 2 * i + 1;
                for (int j = 0; j < n - i - 1; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < stars; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}