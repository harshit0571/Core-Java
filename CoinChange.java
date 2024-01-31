import java.util.Scanner;

public class CoinChange {

    public static int count(int[] coins, int n, int sum) {
        if (n <= 0 || sum < 0)
            return 0;

        if (sum == 0)
            return 1;

        return count(coins, n - 1, sum) + count(coins, n, sum - coins[n - 1]);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int coins[] = new int[n];
        for (int i = 0; i < n; i++) {
            coins[i] = in.nextInt();
        }
        int sum = in.nextInt();
        System.out.println(count(coins, n, sum));
    }

}
