import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IdentifyingSubarrayswithZeroSumTotal {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String str = inp.nextLine();
        String[] S = str.split(" ");
        int[] arr = new int[S.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(S[i]);
        }
        int s = 0;
        int e = 0;
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        while (s < arr.length) {
            int count = 0;
            ArrayList<Integer> sub = new ArrayList<>();
            while (e < arr.length) {
                count += arr[e];
                sub.add(arr[e]);
                if (count == 0) {
                    ans.add(new ArrayList<>(sub));
                }
                e++;
            }

            s++;
            e = s;

        }
        System.out.println(ans);

    }
}
