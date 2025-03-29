import java.util.Scanner;
class NoMatchException extends Exception{
    public NoMatchException() {
        super("String does not match 'India'");
    }
}

public class exception{
    public static void checkString(String input) throws NoMatchException {
        if (!input.equals("India")) {
            throw new NoMatchException();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();
        
        try {
            checkString(userInput);
            System.out.println("Success! String matches 'India'");
        } catch (NoMatchException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
    }