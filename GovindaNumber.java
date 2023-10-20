import java.util.ArrayList;
import java.util.Scanner;

public class GovindaNumber {
    static boolean Prime(int n) {
        for (int i = 2; i < n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int N = n;
        int i = 2;
        ArrayList<Integer> factors = new ArrayList<>();
        while (i <= n) {
            if (Prime(i)) {
                while (n % i == 0) {
                    n = n / i;
                    factors.add(i);
                }
            }
            i++;
        }
        int sum = 0;
        int fact = 0;
        while (N > 0) {
            sum += N % 10;
            N /= 10;
        }
        for (int j = 0; j < factors.size(); j++) {
            fact += factors.get(j);
        }

        if (sum == fact) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }
}
