import java.util.Scanner;

public class ReverseWhileMaintainingSpace {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String str = inp.nextLine();
        int k = str.length() - 1;
        String ans = "";
        for (int i = 0; i < str.length(); i++) {
            ans += (str.charAt(i) == ' ' ? " " : "") + "" + str.charAt(k);
            k--;
        }
        System.out.println(ans);
    }
}
