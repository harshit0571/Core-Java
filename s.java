import java.util.*;

public class s {
    public static void main(String[] args) {
        // StringBuilder sb = new StringBuilder("as");
        // sb.append('d');
        // System.out.println(sb.toString());
        // double t = 1.9484;
        // System.out.printf("%.2f", t);
        Scanner inp = new Scanner(System.in);
        String s = inp.nextLine();
        int sum = 0;
        String temp = "";
        boolean flag = false;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                temp = temp + s.charAt(i);
                flag = true;
                if (i == s.length() - 1) {
                    sum = sum + Integer.parseInt(temp);
                }
            } else {
                if (flag) {
                    sum = sum + Integer.parseInt(temp);
                    flag = false;
                }
                temp = "";
            }
        }
        System.out.println(sum);
    }
}
