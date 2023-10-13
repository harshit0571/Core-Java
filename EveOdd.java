import java.util.ArrayList;
import java.util.Scanner;

public class EveOdd {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int a = inp.nextInt();
            list.add(a);
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 != 0) {
                list2.add(list.get(i));
            }
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                list2.add(list.get(i));
            }
        }

        for (int i = 0; i < list2.size(); i++) {
            System.out.print(list2.get(i) + " ");
        }
    }
}
