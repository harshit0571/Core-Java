import java.util.*;

public class april26 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int n = inp.nextInt();
        int t = inp.nextInt();
        for (int index = 0; index < n; index++) {
            int a = inp.nextInt();
            arr.add(a);
        }
        int p1 = -1;
        int p2 = -1;
        for (int i = 0; i < arr.size(); i++) {
            int sum = 0;
            for (int j = i; j < arr.size(); j++) {
                sum += arr.get(j);
                if (sum == t) {
                    p1 = i;
                    p2 = j;
                    break;
                }
            }
            if (sum == t) {
                break;
            }
        }
        System.out.println((p1 + 1) + " " + (p2 + 1));

    }
}
