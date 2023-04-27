import java.util.*;

public class array {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = 0;
        int t = 0;
        int i = 0;
        int j = 0;
        int k = 0;
        while (n != 0) {
            r = n % 10;
            n = n / 10;
            i = 9 - r;
            if (i == 0) {
                i = 9;
            } else if (i > r) {
                i = r;
            }

            t = t * 10 + i;
        }

        while (t != 0) {
            j = t % 10;
            t = t / 10;
            k = k * 10 + j;
        }
        System.out.print(k);

    }

}