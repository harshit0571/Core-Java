import java.util.Scanner;

public class IntegerTObinary {
    static String toBinary(int n) {
        int arr[] = new int[100];
        int i = 0;
        while (n != 0) {
            arr[i] = n % 2;
            n = n / 2;
            i++;
        }
        String ans = "";
        for (int j = i - 1; j >= 0; j--) {
            ans = ans + "" + arr[j];
        }
        return ans;

    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            String n = toBinary(i);
            System.out.println(n);
        }
    }
}
