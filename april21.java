import java.util.Scanner;

class A {
    int a;
    int b;
}

class B extends A {

    void sum() {
        System.out.println("sum is " + (a + b));
    }
}

class C extends B {
    void multiplication() {
        System.out.println("product is " + (a * b));
    }
}

public class april21 {
    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);
        C obj1 = new C();
        obj1.a = inp.nextInt();
        obj1.b = inp.nextInt();
        obj1.multiplication();

        B obj2 = obj1;
        obj2.sum();

    }

}

// write java program to aplly inheritence concept execute of syb classes sum
// and mutiplication, a var, b sum , c multiplication