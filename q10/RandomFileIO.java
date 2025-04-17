import java.io.*;
import java.util.*;
public class RandomFileIO {
public static void main(String[] args) {
String fileName = "rand.dat";
Random rand = new Random();
try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(fileName))) {
System.out.println("Generating and saving 10 random integers...");
for (int i = 0; i < 10; i++) {
int randomNum = rand.nextInt(100);
dos.writeInt(randomNum);
}
} catch (IOException e) {
System.out.println("Error writing to file: " + e.getMessage());
}
try (DataInputStream dis = new DataInputStream(new FileInputStream(fileName))) {
System.out.println("Reading integers from file:");
while (true) {
int number = dis.readInt();
System.out.print(number + " ");
}
} catch (EOFException e) {
System.out.println("\nEnd of file reached.");
} catch (IOException e) {
System.out.println("Error reading from file: " + e.getMessage());
}
}
}
