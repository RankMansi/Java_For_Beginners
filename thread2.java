public class thread2 {
    public static void main(String[] args) {
        int n1 = 5; // The number for the child thread
        int n2 = 7; // The number for the main thread

        ChildThread childThread = new ChildThread(n1);
        childThread.start();

        try {
            childThread.join(); // Wait for the child thread to complete
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main Thread - Multiplication Table of " + n2);
        for (int i = 1; i <= 10; i++) {
            System.out.println(n2 + " x " + i + " = " + (n2 * i));
        }
    }
}

class ChildThread extends Thread {
    private int n;

    public ChildThread(int n) {
        this.n = n;
    }

    public void run() {
        System.out.println("Child Thread - Multiplication Table of " + n);
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
            try {
                Thread.sleep(500); // Sleep for 0.5 seconds between each line
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}