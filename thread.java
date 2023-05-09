// Program Main thread and currentThread( ) method

class thread {
    public static void main(String args[]) {
        Thread t = Thread.currentThread();
        System.out.println("Current Thread is = " + t);

        t.setName("My Thread");
        System.out.println("After Changing Name is = " + t);
    }
}
// Output:

// Current Thread is = Thread[main,5,main]
// After Changing Name is = Thread[My Thread,5,main]