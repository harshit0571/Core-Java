import java.util.Scanner;

public class Delete10_00 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int t = inp.nextInt();
        inp.nextLine();

        while (t > 0) {
            String s = inp.nextLine();

            while (s.contains("01") || s.contains("10")) {
                if (s.contains("01")) {
                    s = s.replace("01", "");
                }
                if (s.contains("10")) {
                    s = s.replace("10", "");
                }

            }
            System.out.println(s.length());
            t--;
        }
    }
}
