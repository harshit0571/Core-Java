import java.util.Arrays;
import java.util.Scanner;

public class memoization_fibo {
    static int fibo(int n, int[] dp) {
        if (n <= 1) {
            return n;
        }
        if (dp[n] != -1) {
            return dp[n];
        }
        return dp[n] = fibo(n - 1, dp) + fibo(n - 2, dp);
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();

        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);

        // for (int i = 0; i < n; i++) {
        // System.out.println(fibo(i, dp));
        // }
        System.out.println(fibo(n, dp));

    }
}

// 0 1 1 2 3 5