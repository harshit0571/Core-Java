import java.util.Scanner;

public class patternMatching {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String s = inp.nextLine();
        String p = inp.nextLine();
        boolean flag = true;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == p.charAt(0)) {
                int k = 0;
                for (int j = i; j < s.length() && k < p.length(); j++) {
                    if (s.charAt(i) != p.charAt(k)) {
                        flag = false;
                    }
                    k++;
                }
                if (flag) {
                    System.out.println("true");
                }
            }
        }

        if (!flag) {
            System.out.println("false");
        }
    }
}
