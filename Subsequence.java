import java.util.ArrayList;
import java.util.Scanner;

public class Subsequence {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String s = inp.nextLine();

        ArrayList<String> ans = new ArrayList<>();
        ans.add("");
        for (int i = 0; i < s.length(); i++) {
            int size = ans.size();
            for (int j = 0; j < size; j++) {
                ans.add(ans.get(j) + s.charAt(i));
            }

        }
        System.out.println(ans);
    }
}
