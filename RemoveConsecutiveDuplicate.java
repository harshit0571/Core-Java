import java.util.ArrayList;
import java.util.Scanner;

public class RemoveConsecutiveDuplicate {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = inp.nextInt();
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                ans.add(arr[i]);
            }
            if (i == arr.length - 2) {
                ans.add(arr[i + 1]);
            }
        }

        System.out.println(ans);

    }
}
