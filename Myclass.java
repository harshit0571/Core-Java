// 1. What will be the output of the program?
// ans - run
// class Test extends Thread {
//     public void run() {
//         System.out.println("Run");
//     }
// }

// class Myclass {
//     public static void main(String[] args) {
//         Test t = new Test();
//         t.start();
//     }
// }

// 2. What will be the output of the program?
//ans- Run

// class Test extends Thread {
//     public void run() {
//         System.out.println("Run");
//     }
// }

// class Myclass {
//     public static void main(String[] args) {
//         Test t = new Test();
//         t.run();
//     }
// }

// 3. What will be the order of output of the program?
// ans- Main
//      Run

// class Test extends Thread {
//     public void run() {
//         System.out.println("Run");
//     }
// }

// class Myclass {
//     public static void main(String[] args) {
//         Test t = new Test();
//         t.start();
//         System.out.println("Main");
//     }
// }

// What will be the output of the program?

// class Test implements Runnable {
// public
// void run()
// {
// System.out.println("Run");
// }
// } class Myclass {
// public
// static void main(String[] args)
// {
// Test t = new Test();
// t.start();
// System.out.println("Main");
// }
// }

// 5. What will be the output of the program?
// ans- Main

class Test implements Runnable {
    public void run() {
        System.out.println("Run");
    }
}

class Myclass {
    public static void main(String[] args) {
        Thread t1 = new Thread();
        t1.start();
        System.out.println("Main");
    }
}
