import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try {
            try ( // Connect to server
                    Socket socket = new Socket("localhost", 5000)) {
                System.out.println("Connected to server");
                
                // Create input and output streams
                DataInputStream inputStream = new DataInputStream(socket.getInputStream());
                DataOutputStream outputStream = new DataOutputStream(socket.getOutputStream());
                
                try ( // Get radius from user
                        Scanner scanner = new Scanner(System.in)) {
                    System.out.print("Enter radius of circle: ");
                    double radius = scanner.nextDouble();
                    // Send radius to server
                    outputStream.writeDouble(radius);
                    System.out.println("Sent radius: " + radius);
                    // Receive area from server
                    double area = inputStream.readDouble();
                    System.out.println("Area of circle: " + area);
                    // Close resources
                }
            }
        } catch (IOException e) {
        }
    }
}
