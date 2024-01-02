package labworks.lab5.Pharmacy;

class PrintNumbers extends Thread {
    private int start;
    private int end;

    // Constructor to initialize the start and end values
    public PrintNumbers(int start, int end) {
        this.start = start;
        this.end = end;
    }

    // Run method contains the code to be executed by the thread
    @Override
    public void run() {
        for (int i = start; i <= end; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }
    }
}

public class MultiThreadExample {
    public static void main(String[] args) {
        // Create two threads
        PrintNumbers thread1 = new PrintNumbers(1, 5);
        PrintNumbers thread2 = new PrintNumbers(6, 10);

        // Set names for the threads (optional)
        thread1.setName("Thread 1");
        thread2.setName("Thread 2");

        // Start the threads
        thread1.start();
        thread2.start();
    }
}
