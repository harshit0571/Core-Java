import java.util.ArrayList;
import java.util.Scanner;

public class Appends {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int k = inp.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = inp.nextInt();
        }

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = n - k; i < n; i++) {
            list.add(arr[i]);
        }
        for (int i = 0; i < n - k; i++) {
            list.add(arr[i]);
        }
        for (int i = 0; i < n; i++) {
            System.out.print(list.get(i) + " ");
        }

    }
}
