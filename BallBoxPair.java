import java.util.Arrays;
import java.util.Scanner;

public class BallBoxPair {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = inp.nextInt();
        }
        int count = 0;
        Arrays.sort(arr);
        int rem = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] >= 2) {
                count += arr[i] / 2;
                rem = arr[i] % 2;
            }
            if (rem == 1 && i != arr.length - 1) {
                if (arr[i + 1] - arr[i] <= 1) {
                    count++;
                    rem = 0;
                    arr[i + 1] -= 1;
                }
            }
        }
        System.out.println(count);
    }
}
