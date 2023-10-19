import java.util.Scanner;

public class NthPalindromicBinaryNumber {
    static boolean checkPali(String str) {
        int s = 0;
        int e = str.length() - 1;
        while (s < e) {
            if (str.charAt(s) != str.charAt(e)) {
                return false;
            }
            s++;
            e--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int i = 1;
        while (n > 0) {
            String str = Integer.toBinaryString(i);
            if (checkPali(str)) {
                System.out.println(str + " " + i);
                n--;
            }
            i++;
        }

    }
}
