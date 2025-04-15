import java.io.*;
import java.util.Scanner;

public class FileCopy{
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String sourceFileName;
            String destinationFileName;
            if(args.length == 2){
                sourceFileName = args[0];
                destinationFileName = args[1];
            } else {
                System.out.println("Enter the source file name:");
                sourceFileName = scanner.nextLine();
                System.out.println("Enter the destination file name:");
                destinationFileName = scanner.nextLine();
            }
            try {
                copyUsingCharacterStream(sourceFileName, destinationFileName + ".char");
                System.out.println("File copied using character streams to: " + destinationFileName + ".char");
            }  catch (IOException e) {
                System.err.println("Error copying using character streams: " + e.getMessage());
            }
            try {
                copyUsingByteStreams(sourceFileName, destinationFileName + ".byte");
                System.out.println("File copied using byte streams to: " + destinationFileName + ".byte");
            } catch (IOException e) {
                System.err.println("Error copying using byte streams: " + e.getMessage());
            }
            try {
                copyUsingBufferedStreams(sourceFileName, destinationFileName + ".buffered");
                System.out.println("File copied using buffered streams to: " + destinationFileName + ".buffered");
            } catch (IOException e) {
                System.err.println("Error copying using buffered streams: " + e.getMessage());
            }
    }
}

public static void copyUsingCharacterStream(String source, String destination) throws IOException {
    try(FileReader reader = new FileReader(source);
        FileWriter writer = new FileWriter(destination)) {

        int character;
        while ((character = reader.read()) != -1) {
            writer.write(character);
        }
    }
}
public static void copyUsingByteStreams(String source, String destination) throws IOException {
    try (FileInputStream in = new FileInputStream(source);
         FileOutputStream out = new FileOutputStream(destination)) {

        int data;
        while ((data = in.read()) != -1) {
            out.write(data);
        }
    }
}


public static void copyUsingBufferedStreams(String source, String destination) throws IOException {
    try (BufferedInputStream in = new BufferedInputStream(new FileInputStream(source));
         BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(destination))) {

        byte[] buffer = new byte[1024];
        int bytesRead;
        while ((bytesRead = in.read(buffer)) != -1) {
            out.write(buffer, 0, bytesRead);
        }
    }
}
}
