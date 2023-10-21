import java.util.*;

public class Space {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int k = str.length() - 1;
        String temp = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                temp += ' ';
            }
            temp += str.charAt(k);
            k--;

        }
        System.out.println(temp);

    }
}
