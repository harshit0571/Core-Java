import java.util.*;

public class FindingProductiveCharacterPairsinaString {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String str = inp.nextLine();
        String ans = "";
        for (int i = 0; i < str.length(); i++) {
            if (i == str.length() - 1 && str.length() % 2 != 0) {
                ans += str.charAt(i) + "";
            } else if (str.charAt(i) > str.charAt(i + 1)) {
                ans += str.charAt(i) + "";
            } else {
                ans += str.charAt(i + 1) + "";
            }
            i++;
        }
        System.out.println(ans);
    }
}
