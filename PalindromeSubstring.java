import java.util.ArrayList;
import java.util.Scanner;

public class PalindromeSubstring {
    static boolean checkPali(String str, int s, int e) {
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
        String str = inp.nextLine();

        int s = 0;
        int e = 0;
        ArrayList<String> ans = new ArrayList<>();

        while (s < str.length()) {
            while (e < str.length()) {
                if (checkPali(str, s, e)) {
                    ans.add(str.substring(s, e + 1));
                }
                e++;
            }
            s++;
            e = s;
        }
        System.out.println(ans);
    }
}
