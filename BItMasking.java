import java.util.Scanner;

public class BItMasking {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();

        String s = Integer.toBinaryString(n);
        char[] arr = s.toCharArray();

        arr[1] = '1';

        String s2 = new String(arr);

        int a = Integer.parseInt("111", 2);
        System.out.println(a);

    }
}
