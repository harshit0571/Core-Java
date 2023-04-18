import java.util.Scanner;

public class Addition_program {
    int a = 10;

    int add(int a, int b) {
        return a + b;
    }

    int sub(int a, int b) {
        return a - b;
    }

    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);
        System.out.println("enter two variables ");
        int n1, n2;
        n1 = inp.nextInt();
        n2 = inp.nextInt();
        Addition_program obj1 = new Addition_program();
        int a = obj1.add(n1, n2);
        System.out.println("sum is " + a);
        a = obj1.sub(n1, n2);
        System.out.println("difference is " + a);
    }
}
