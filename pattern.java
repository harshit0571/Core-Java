import java.util.Scanner;

public class pattern {
    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int j = n; j >= n - i; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(" ");
            }
            for (int j = n; j >= i + 1; j--) {
                System.out.print(j);
            }
            System.out.println();

        }
    }
}
