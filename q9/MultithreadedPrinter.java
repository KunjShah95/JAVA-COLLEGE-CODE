import java.util.Scanner;

public class MultithreadedPrinter {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Press Enter to start the threads...");
            scanner.nextLine(); 
            
            Thread threadA = new Thread(new PrintTask('a', 100));
            Thread threadB = new Thread(new PrintTask('b', 100));
            Thread threadC = new Thread(new PrintNumberTask(1, 100));
            
            threadA.start();
            threadB.start();
            threadC.start();
        }
    }
}

class PrintTask implements Runnable {
    private final char charToPrint;
    private final int times;

    public PrintTask(char charToPrint, int times) {
        this.charToPrint = charToPrint;
        this.times = times;
    }

    @Override
    public void run() {
        for (int i = 0; i < times; i++) {
            System.out.print(charToPrint);
        }
        System.out.println(); 
    }
}

class PrintNumberTask implements Runnable {
    private final int start;
    private final int end;

    public PrintNumberTask(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        for (int i = start; i <= end; i++) {
            System.out.print(i + " ");
        }
        System.out.println(); 
    }
}
