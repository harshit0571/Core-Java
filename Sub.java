import java.util.ArrayList;
import java.util.Scanner;

public class Sub {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int a = inp.nextInt();

        ArrayList<Integer> arr = new ArrayList<>();
        for (int index = 0; index < a; index++) {
            int b = inp.nextInt();
            arr.add(b);
        }

        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }

    }
}
