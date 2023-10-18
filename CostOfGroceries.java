import java.util.Scanner;

public class CostOfGroceries {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int x = inp.nextInt();
        int f[] = new int[n];
        int p[] = new int[n];
        for (int i = 0; i < n; i++) {
            f[i] = inp.nextInt();
        }
        for (int i = 0; i < n; i++) {
            p[i] = inp.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (f[i] >= x) {
                sum += p[i];
            }
        }
        System.out.println(sum);

    }
}