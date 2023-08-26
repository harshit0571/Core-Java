import java.util.Scanner;

public class maxSubArray {
    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int[] arr = new int[n];

        // 1 2 4 5 6 7 -1 -2;
        // -1 8 2 -6;

        for (int i = 0; i < n; i++) {
            arr[i] = inp.nextInt();
        }

        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            max = Math.max(max, sum);

            if (sum < 0) {
                sum = 0;
            }

        }
        System.out.println(max);
    }
}
