
// Online Java Compiler 
// Use this editor to write, compile and run your Java code online
import java.util.*;

class HelloWorld {
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

        int n2 = inp.nextInt();
        int m2 = inp.nextInt();

        int[][] arr2 = new int[n2][m2];
        for (int i = 0; i < n2; i++) {
            for (int j = 0; j < m2; j++) {
                arr2[i][j] = inp.nextInt();
            }
        }

        if (m != n2) {
            System.out.println("false");
        } else {
            int[][] ans = new int[n][m2];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m2; j++) {
                    for (int k = 0; k < m; k++) {
                        ans[i][j] += arr[i][k] * arr2[k][j];
                    }
                }
            }

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m2; j++) {
                    System.out.println(ans[i][j] + " ");
                }
                System.out.println();
            }
        }

    }
}
