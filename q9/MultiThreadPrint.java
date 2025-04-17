public class MultiThreadPrint {
    public static void main(String[] args) {
        Thread threadA = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                System.out.print("a ");
            }
        });
    Thread threadB = new Thread(() -> {
    for (int i = 0; i < 100; i++) {
    System.out.print("b ");
    }
    });
        Thread threadC = new Thread(() -> {
            for (int i = 1; i <= 100; i++) {
                System.out.print(i + " ");
            }
        });
    threadA.start();
    try {
        Thread.sleep(1000); 
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    threadB.start();
    threadC.start();
    }
    }    