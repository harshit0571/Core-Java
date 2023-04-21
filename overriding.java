class A {
    void m1() {
        System.out.println("class A's function");
    }
}

class B extends A {
    void m1() {
        System.out.println("class B's function");
    }
}

public class overriding {
    public static void main(String args[]) {
        A obj1 = new A();
        obj1.m1();
        B obj2 = new B();
        obj2.m1();
    }

}
