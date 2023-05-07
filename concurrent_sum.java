import java.util.Scanner;

public class concurrent_sum {
    public static void main(String[] args) {
        // 1 2 3 6
        int n;
        Scanner inp = new Scanner(System.in);
        n = inp.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = inp.nextInt();
        }
        String str = "d";

        int sum = 0;
        int curr = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - arr[i - 1] == 1) {
                if (curr == 0) {
                    curr = arr[i] + curr + arr[i - 1];
                } else {
                    curr = arr[i] + curr;
                }
            } else {
                sum = sum + curr;
                curr = 0;
            }
        }
        sum = sum + curr;
        System.out.println(sum);
    }
}