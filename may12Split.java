import java.util.Scanner;

public class may12Split {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String s = inp.nextLine();
        char c = inp.nextLine().charAt(0);
        try {
            String ans = "";
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == c) {
                    System.out.println(ans);
                    ans = "";
                } else {
                    ans = ans + s.charAt(i);
                }

                if (i == s.length() - 1) {
                    System.out.println(ans);
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
