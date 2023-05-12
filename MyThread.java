//1
// public class MyThread extends Thread {
//     public void run() {
//         System.out.println("Thread is running.");
//     }

//     public static void main(String[] args) {
//         MyThread t = new MyThread();
//         t.start();
//     }
// }

//2
// public class MyThread extends Thread {
//     public void run() {
//         for (int i = 1; i <= 10; i++) {
//             System.out.println(i);
//         }
//     }

//     public static void main(String[] args) {
//         MyThread t = new MyThread();
//         t.start();
//     }
// }

//3
public class MyThread extends Thread {
    private int start;

    public MyThread(int start) {
        this.start = start;
    }

    public void run() {
        for (int i = start; i <= 10; i += 2) {
            System.out.println(i);
            try {
                Thread.sleep(1000); // pause for a second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        MyThread t1 = new MyThread(1);
        MyThread t2 = new MyThread(2);
        t1.start();
        t2.start();
    }
}