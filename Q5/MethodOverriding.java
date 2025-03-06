import java.util.Scanner;

class A3 {
    void hello(String s) {
        System.out.println("A3: Hello from " + s);
    }
}

class B3 extends A3 {
    @Override
    void hello(String s) {
        System.out.println("B3: Hello from " + s);
        super.hello(s);
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a string: ");
            String userInput = scanner.nextLine();
            
            A3 obj = new B3();
            obj.hello(userInput);
        }
    }
}
