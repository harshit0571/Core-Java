import java.util.Scanner;

public class StarPattern {
    public static void main(String[] args) {
        // Scanner inp = new Scanner(System.in);
        // int n = inp.nextInt();5
        // for (int i = 0; i < (n % 2 == 0 ? n / 2 : n / 2 + 1); i++) {
        // for (int s = 0; s < i; s++) {
        // System.out.print("*");
        // }
        // System.out.print(n - i);
        // for (int s = 0; s < n - 2 * (i) - 2; s++) {
        // System.out.print("*");
        // }

        // System.out.print(n % 2 == 0 ? (n - i) : (i == n / 2 ? ("") : (n - i)));

        // System.out.println();

        // }
        // for (int i = 0; i < n / 2; i++) {
        // for (int j = 0; j < n / 2 - i - 1; j++) {
        // System.out.print("*");
        // }
        // System.out.print((n % 2 == 0 ? n / 2 : n / 2 + 1) + i + 1);
        // for (int j = 0; j < 2 * i + 1; j++) {
        // System.out.print("*");
        // }
        // System.out.print((n % 2 == 0 ? n / 2 : n / 2 + 1) + i + 1);

        // System.out.println();
        // }

        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();

        int temp = n;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == j || j == n - i + 1) {
                    System.out.print(temp + " ");
                } else {
                    System.out.print("  ");
                }
            }

            if (i <= n / 2) {
                temp--;
                if (n % 2 == 0 && i == n / 2) {
                    temp++;
                }
            } else {
                temp++;
            }
            System.out.println();
        }

    }
}
