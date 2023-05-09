// Program to use getName( ) and getPriority( )
public class thread2 {
    public static void main(String[] args) {
        System.out.println("Thread Name = " + Thread.currentThread().getName());
        System.out.println("Priority= " + Thread.currentThread().getPriority());
    }
}

// Output:

// Thread Name = main
// Priority    =  5