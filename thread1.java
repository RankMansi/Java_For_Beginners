public class thread1 {
    public static void main(String[] args) {
        ChildThread1 childThread1 = new ChildThread1();
        childThread1.start();

        Runnable childRunnable2 = new ChildRunnable2();
        Thread childThread2 = new Thread(childRunnable2);
        childThread2.start();

        for (int i = 501; i <= 700; i++) {
            System.out.println("Main Thread: Greetings from Thread " + Thread.currentThread().getName() + " - " + i);
        }
    }
}

class ChildThread1 extends Thread {
    public void run() {
        for (int i = 1; i <= 250; i++) {
            System.out.println("Child-Thread1: Value " + i);
        }
    }
}

class ChildThread2 implements Runnable {
    public void run() {
        for (int i = 251; i <= 500; i++) {
            System.out.println("Child-Thread2: Value " + i);
        }
    }
}
