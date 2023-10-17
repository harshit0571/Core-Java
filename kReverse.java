import java.util.Scanner;

public class kReverse {
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

        for (int i = 0; i < n; i++) {
            reverse(arr, i, i + k - 1);
            i = i + k - 1;
            System.out.println(i);
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
