import java.util.Scanner;
public class Main10
{
    public static void main(String[] args)
    {
        int count;
        String temp;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of strings:");
        count = sc.nextInt();
       
        String str[] = new String[count];
        Scanner sc2 = new Scanner(System.in);
       
        System.out.println("Enter the Strings:");
        for(int i = 0; i < count; i++)
        {
            str[i] = sc2.nextLine();
        }
        sc.close();
        sc2.close();
        for (int i = 0; i < count; i++)
        {
            for (int j = i + 1; j < count; j++) {
                if (str[i].compareTo(str[j])>0)
                {
                    temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }
            }
        }
       
        System.out.print("Strings in alphabetical Order:");
        for (int i = 0; i <= count - 1; i++)
        {
            System.out.print(str[i] + ", ");
        }
    }
}