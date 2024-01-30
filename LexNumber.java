import java.util.Arrays;
import java.util.Scanner;

public class LexNumber {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.toString(i + 1);
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
