import java.util.Arrays;
import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = inp.nextInt();
        }
        String s[] = new String[n];
        for (int i = 0; i < n; i++) {
            s[i] = Integer.toString(arr[i]);
        }
        Arrays.sort(s);
        String ans = "";
        for (int i = n - 1; i >= 0; i--) {
            ans += s[i];
        }

        System.out.println(ans);
    }
}
