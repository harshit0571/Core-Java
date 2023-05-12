import java.util.*;

public class rotate {
    static void reverse(char[] c, int l, int r) {
        while (l < r) {
            char temp = c[l];
            c[l] = c[r];
            c[r] = temp;
            l++;
            r--;
        }
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String str = inp.nextLine();
        char[] ch = str.toCharArray();
        reverse(ch, 0, ch.length - 1);
        reverse(ch, ch.length - 2, ch.length - 1);
        System.out.println(ch);
        // 5 4 3 2 1

    }
}
