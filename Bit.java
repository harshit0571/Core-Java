import java.util.Scanner;

public class Bit {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int k = inp.nextInt();

        String str = Integer.toBinaryString(n);
        char[] arr = str.toCharArray();
        arr[k - 1] = '1';
        String ans = new String(arr);
        int a = Integer.parseInt(ans, 2);
        System.out.println(a);
    }
}
