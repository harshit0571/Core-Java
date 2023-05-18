class threadthing extends Thread {
    private int threadNumber;

    threadthing(int i) {
        this.threadNumber = i;
    }

    threadthing() {
    }

    static void o(int i) {
        System.out.println("concurrent process " + i);
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("thread no. " + threadNumber + " task " + i);
        }
        o(threadNumber);
    }
}

public class multiThreading {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            threadthing obj = new threadthing(i);
            obj.start();
            // try {
            // obj.join();
            // } catch (Exception e) {
            // // TODO: handle exception
            // }
        }
    }
}
