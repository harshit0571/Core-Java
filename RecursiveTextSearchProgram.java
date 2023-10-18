import java.util.ArrayList;
import java.util.Scanner;

public class RecursiveTextSearchProgram {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String str = inp.nextLine();
        String pat = inp.nextLine();
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == pat.charAt(0) && (i + pat.length() <= str.length())) {
                if (str.substring(i, i + pat.length()).equals(pat)) {
                    ans.add(i);
                }
            }
        }
        System.out.println(ans);
    }
}
