
import java.util.*;

public class Rotate {
    static void reverse(int[] arr, int s, int k) {
        while (s < k) {
            int temp = arr[s];
            arr[s] = arr[k];
            arr[k] = temp;

            s++;
            k--;
        }

    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int k = inp.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = inp.nextInt();
        }

        reverse(arr, 0, n - 1);

        reverse(arr, 0, n - k - 1);

        reverse(arr, n - k, n - 1);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
