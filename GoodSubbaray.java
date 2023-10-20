import java.util.HashSet;
import java.util.Scanner;

public class GoodSubbaray {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int k = inp.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = inp.nextInt();
        }

        int s = 0;
        int e = 0;
        int count = 0;
        while (s < arr.length) {
            HashSet<Integer> set = new HashSet<>();
            while (e < arr.length) {
                set.add(arr[e]);
                if (set.size() == k) {
                    count++;
                }
                System.out.print(arr[e] + " ");
                e++;
            }
            System.out.println();
            s++;
            e = s;

        }
        System.out.println(count);

    }
}
