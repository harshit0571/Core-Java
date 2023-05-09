//  Program to create a Thread by Extending from Thread class.

class A extends thread3 {
    public A(String s) {
        super(s);
    }

    public void run() {
        for (int i = 1; i <= 15; i++) {
            System.out.println(getName());
        }
    }
}

class thread3 {
    public static void main(String args[]) {
        A a1 = new A("Java");
        A a2 = new A("Programming");
        A a3 = new A("Examples");

        a1.start();
        a2.start();
        a3.start();

        System.out.println(" Hello !!! ");
    }
}

// Output:

// Java
// Java
// Java
// Java
// Java
// Java
// Java
// Java
// Java
// Programming
// Programming
// Programming
// Java
// Examples
// Examples
// Examples