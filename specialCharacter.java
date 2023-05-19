import java.util.Scanner;

public class specialCharacter {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String s = inp.nextLine();
        String temp = "";
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') || (s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
                    || (s.charAt(i) >= '0' && s.charAt(i) <= '9')) {
                temp = temp + s.charAt(i);
            } else {
                count++;
            }
        }
        System.out.println(count + " " + temp);
    }
}
