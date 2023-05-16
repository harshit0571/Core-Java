import java.util.Scanner;

public class LeftMostNonRepeating {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String s = inp.nextLine();
        boolean flag = false;
        for (int i = 0; i < s.length() - 1; i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    flag = true;
                }
            }
            if (!flag) {
                System.out.println(s.charAt(i));
                break;
            }
            flag = false;
        }

    }
}
