import java.util.Scanner;

public class WaveForm {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int m = inp.nextInt();
        int[][] arr = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = inp.nextInt();
            }
        }

        for (int j = 0; j < m; j++) {
            for (int i = 0; i < n; i++) {
                if (j % 2 == 0) {
                    System.out.print(arr[i][j] + " ");
                } else {
                    System.out.print(arr[n - i - 1][j] + " ");
                }
            }
            System.out.println("");
        }
    }
}
