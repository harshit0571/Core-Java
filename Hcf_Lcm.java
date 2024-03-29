import java.util.*;

class HelloWorld {
    static int bit(int n) {
        int sum = 0;
        int[] arr = new int[1000];
        int i = 0;
        while (n > 0) {
            arr[i] = n % 2;
            n = n / 2;
            i++;
        }

        for (int j = i - 1; j >= 0; j--) {
            sum = sum * 10 + arr[j];
        }

        return sum;

    }

    static int hcf(int n, int k) {
        // 8 6
        int i = n > k ? k : n; // 6

        // 8 6
        // i=6;
        // 5
        // 4
        // 3
        // 2

        while (i > 0) {
            if (n % i == 0 && k % i == 0) {
                return i;
            }
            i--;
        }
        return i;
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int k = inp.nextInt();
        System.out.println(hcf(n, k));
        System.out.println((n * k) / hcf(n, k));

    }
}
