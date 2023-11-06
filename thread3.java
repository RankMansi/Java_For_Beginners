public class thread3 {
    public static void main(String[] args) {
        // Create and start the main thread
        Thread mainThread = new Thread(() -> {
            for (int i = 1; i <= 10; i += 2) {
                System.out.println("Main Thread: 5^" + i + " = " + Math.pow(5, i));
                try {
                    Thread.sleep(600); // Sleep for 0.6 seconds
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // Create and start the child thread
        Thread childThread = new Thread(() -> {
            for (int i = 2; i <= 10; i += 2) {
                System.out.println("Child Thread: 5^" + i + " = " + Math.pow(5, i));
            }
        });

        // Start the main thread
        mainThread.start();

        // Sleep for 0.6 seconds to allow the main thread to start
        try {
            Thread.sleep(600);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Start the child thread
        childThread.start();

        try {
            // Wait for both threads to complete
            mainThread.join();
            childThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
