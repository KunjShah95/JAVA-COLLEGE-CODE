class PrintA implements Runnable {
    public void run() {
    for (int i = 0; i < 100; i++) {
    System.out.print("a ");
    }
    }
    }
    class PrintB implements Runnable {
    public void run() {
    for (int i = 0; i < 100; i++) {
    System.out.print("b ");
    }
    }
    }
    class PrintNumbers implements Runnable {
    public void run() {
    for (int i = 1; i <= 100; i++) {
    System.out.print(i + " ");
    }
    }
    }
    public class RunnableExample {
    public static void main(String[] args) {
    Thread threadA = new Thread(new PrintA());
    Thread threadB = new Thread(new PrintB());
    Thread threadC = new Thread(new PrintNumbers());
    threadA.start();
        try {
            threadB.sleep(1000);
        } catch (InterruptedException ex) {
        }
    threadB.start();
    threadC.start();
    }
    }
    