import java.util.Scanner;

public class Shift {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int a = inp.nextInt();
        System.out.println(Integer.toBinaryString(a));
        System.out.println(a >>> 2);
        System.out.println(Integer.toBinaryString(a >>> 1));
    }
}

// 4>>1; 10
