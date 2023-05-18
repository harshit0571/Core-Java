import java.util.*;

public class StringCompression {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String s = inp.nextLine();
        StringBuilder sb = new StringBuilder();
        int count = 1;
        for (int i = 0; i < s.length(); i++) {
            if (i == s.length() - 1 || s.charAt(i) != s.charAt(i + 1)) {
                sb.append(s.charAt(i) + "" + (count <= 1 ? "" : count));
                count = 1;
            } else {
                count++;
            }
        }
        System.out.println(sb.toString());
    }
}
