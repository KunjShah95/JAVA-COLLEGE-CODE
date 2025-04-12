import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) {
        try {
            // Create server socket
            ServerSocket serverSocket = new ServerSocket(5000);
            System.out.println("Server is running and waiting for client...");

            while (true) {
                // Accept client connection
                Socket clientSocket = serverSocket.accept();
                System.out.println("Client connected from " + clientSocket.getInetAddress());

                // Create input and output streams
                DataInputStream inputStream = new DataInputStream(clientSocket.getInputStream());
                DataOutputStream outputStream = new DataOutputStream(clientSocket.getOutputStream());

                // Read radius from client
                double radius = inputStream.readDouble();
                System.out.println("Received radius: " + radius);

                // Calculate area
                double area = Math.PI * radius * radius;

                // Send area back to client
                outputStream.writeDouble(area);
                System.out.println("Sent area: " + area);

                // Close the connection
                clientSocket.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
