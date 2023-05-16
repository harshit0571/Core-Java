import java.util.Scanner;

public class ReverseEachWordOfString {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String s = inp.nextLine();
        boolean flag = false;

        // hello world
        // olleh dlrow

        String ans = "";
        StringBuilder temp = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                temp.append(s.charAt(i));
            }
            if (s.charAt(i) == ' ' || i == s.length() - 1) {
                ans = ans + temp.reverse().toString() + (i == s.length() - 1 ? "" : " ");
                temp.delete(0, temp.length());
            }

        }
        System.out.println(ans);

    }
}
