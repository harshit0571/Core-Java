import java.util.*;

public class ss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> l = new ArrayList<>();
        int i = 0;
        int j = 1;
        int c = 1;
        for (i = 0; i < n; i++) {
            int m = sc.nextInt();
            l.add(m);
        }
        for (i = 0; i < n; i++) {
            if (i != 0 && l.get(i) > l.get(i - 1)) {
                c++;
                System.out.print(c + " ");
            } else {
                c = 1;
                System.out.print(c + " ");
            }
        }
    }
}