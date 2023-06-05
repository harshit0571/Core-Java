import java.util.*;

public class question1 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        int n = inp.nextInt();
        for (int index = 0; index < n; index++) {
            int a = inp.nextInt();
            arr.add(a);
        }
        // for (int i = 0; i < n; i++) {
        System.out.println(arr);
        // }

    }
}
