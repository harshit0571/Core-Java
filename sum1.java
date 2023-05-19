import java.util.Scanner;

public class sum1 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String s = inp.nextLine();
        int sum = 0;
        String temp = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                temp = temp + s.charAt(i);

                if (i == s.length() - 1) {
                    sum = sum + Integer.parseInt(temp);
                }
            } else {
                sum = sum + (temp.equals("") ? 0 : Integer.parseInt(temp));
                temp = "";

            }

        }
        System.out.println(sum);
    }
}
