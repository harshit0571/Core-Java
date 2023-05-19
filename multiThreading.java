class threadthing extends Thread {
    private int threadNumber;

    threadthing(int i) {
        this.threadNumber = i;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("thread no. " + threadNumber + " task " + i);
        }

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
