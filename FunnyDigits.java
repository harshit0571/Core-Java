import java.util.Scanner;

public class FunnyDigits {
    static boolean check(String str) {
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) >= str.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        while (n >= 0) {
            String s = Integer.toString(n);
            if (check(s)) {
                System.out.println(s);
                break;
            }
            n--;
        }
    }
}
