import java.util.Scanner;

public class StringQ1 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String s = inp.next();

        StringBuilder sb = new StringBuilder(s);
        while (s.contains("01") || s.contains("10")) {
            if (s.contains("01")) {
                int i = s.indexOf("01");
                sb.delete(i, i + 2);
                s = sb.toString();
            }
            if (s.contains("10")) {
                int i = s.indexOf("10");
                sb.delete(i, i + 2);
                s = sb.toString();
            }

        }
        System.out.println(s);
    }
}
