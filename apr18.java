import java.util.Scanner;

public class Day6 {
    // static int c = 0;
    // private Day6()
    // {
    // System.out.println("c = " + c);
    // }
    // public static void main(String[] args)
    // {
    // Day6 w1 = c();
    // System.out.println(w1);
    // Day6 w2 = c(w1);
    // System.out.println("w2--->"+c);
    // System.out.println("w2"+w2);
    // Day6 w3 = c(w2);
    // System.out.println("w2--->"+c);
    // System.out.println("w2"+w3);
    // Day6 w4 = c(w3);
    // System.out.println("w2--->"+c);
    // System.out.println("w2"+w3);
    // }
    // static Day6 c()
    // {
    // return c++ <= 0 ? new Day6() : null;
    // }

    // static Day6 c(Day6 w)
    // {
    // return w.c++ == 1 ? new Day6() : null;
    // }
    // int a = 10;
    // int b = 20;
    // void function(){
    // System.out.println("Hello! Function has been called now.");
    // }
    // public static void main(String[] args){
    // Day6 t = new Day6();
    // System.out.println(t.a+t.b);
    // t.function();
    // }
    void add(int a, int b) {
        System.out.println(a + b);
    }

    void sub(int a, int b) {
        System.out.println(a - b);
    }

    public static void main(String[] args) {
        Day6 obj = new Day6();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        obj.add(a, b);
        obj.sub(a, b);
    }
}