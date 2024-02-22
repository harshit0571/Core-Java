import java.util.HashMap;
import java.util.Scanner;

public class prefixArray {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = inp.nextInt();
        }

        for (int i = 0; i < n; i++) {

        }
        // HashMap<Integer, Integer> map = new HashMap<>();
        // for (int i = 0; i < arr.length; i++) {
        // if (map.containsKey(arr[i])) {
        // map.put(arr[i], map.get(arr[i]) + 1);
        // } else {
        // map.put(arr[i], 1);
        // }
        // }

        // for (int i = 0; i < n; i++) {
        // System.out.print(map.get(arr[i]) + " ");
        // }
    }
}
