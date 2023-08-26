
import java.util.*;

public class SortStringArray {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int n = inp.nextInt();

        inp.nextLine();
        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            arr[i] = inp.nextLine();
        }

        Arrays.toString(arr);

        // System.out.println();

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
