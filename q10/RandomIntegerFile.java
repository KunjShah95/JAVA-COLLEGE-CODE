import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class RandomIntegerFile {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the number of random integers to generate:");
            int numIntegers = getValidInteger(scanner);
            
            generateRandomIntegers(numIntegers, "rand.dat");
            
            readAndDisplayIntegers("rand.dat");
        }
    }

    private static int getValidInteger(Scanner scanner) {
        while (true) {
            String input = scanner.nextLine();
            try {
                int number = Integer.parseInt(input);
                if (number > 0) {
                    return number;
                } else {
                    System.out.println("Please enter a positive integer.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
            }
        }
    }

    public static void generateRandomIntegers(int count, String filename) {
        Random random = new Random();
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(filename))) {
            for (int i = 0; i < count; i++) {
                dos.writeInt(random.nextInt());
            }
            System.out.println(count + " random integers have been written to " + filename);
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }
    public static void readAndDisplayIntegers(String filename) {
        try (DataInputStream dis = new DataInputStream(new FileInputStream(filename))) {
            System.out.println("Integers read from " + filename + ":");
            while (dis.available() > 0) {
                System.out.println(dis.readInt());
            }
        } catch (EOFException e) {
        } catch (IOException e) {
            System.err.println("Error reading from file: " + e.getMessage());
        }
    }
}
