import java.util.Scanner;

public class Alphabetical {
    public static void main(String[] args) {
        int count;
        String temp;
        String[] str;
        Scanner scan2;
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Enter the number of strings to sort: ");
            count = scan.nextInt();
            str = new String[count];
            scan2 = new Scanner(System.in);
            System.out.println("Enter the strings : ");
            for (int i = 0; i < count; i++) {
                str[i] = scan2.nextLine();
            }
        }
        scan2.close();

        for (int i = 0; i < count - 1; i++) {
            for (int j = i + 1; j < count; j++) {
                if (str[i].compareTo(str[j]) > 0) {
                    temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }
            }
        }

        System.out.println("Sorted strings in alphabetical order are as follows: ");
        for (int i = 0; i < count; i++) {

            System.out.println(str[i]);
        }
    }
}

