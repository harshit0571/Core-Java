import java.util.Scanner;

public class StringUpperCase {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String str = inp.nextLine();
        char[] ch = str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] >= 'A' && ch[i] <= 'Z') {
                ch[i] = (char) (ch[i] + 32);
            } else {
                ch[i] = (char) (ch[i] - 32);
            }
        }
        String s = new String(ch);
        System.out.println(s);
    }
}
