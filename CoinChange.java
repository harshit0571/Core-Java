import java.util.Scanner;

public class CoinChange {
    static int Coin(int[] coin, int n, int sum) {
        if (n <= 0 || sum < 0) {
            return 0;
        }

        if (sum == 0) {
            return 1;
        }

        return Coin(coin, n - 1, sum) + Coin(coin, n, sum - coin[n - 1]);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int coins[] = new int[n];
        for (int i = 0; i < n; i++) {
            coins[i] = in.nextInt();
        }
        int t = in.nextInt();
        System.out.println(Coin(coins, n, t));

    }

}
