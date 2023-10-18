import java.util.Scanner;

public class RunningwithAliceandBob {
    static boolean check(int p, int q) {
        if (p > 2 * q) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int A[] = new int[n];
        int B[] = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = inp.nextInt();
        }
        for (int i = 0; i < n; i++) {
            B[i] = inp.nextInt();
        }
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (check(A[i], B[i]) && check(B[i], A[i])) {
                count++;
            }
        }
        System.out.println(count);
    }
}
