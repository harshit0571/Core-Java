import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MaxStream {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int k = inp.nextInt();
        int n = inp.nextInt();
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(n);
        while (n != -1) {
            Collections.sort(ans);
            if (k > ans.size()) {
                System.out.println("-1");
            } else {
                System.out.println("kth element is: " + ans.get(ans.size() - k));

            }
            n = inp.nextInt();
            ans.add(n);

        }
    }
}
