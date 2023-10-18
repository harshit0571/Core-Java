import java.util.ArrayList;
import java.util.Scanner;

public class KthElementfromlastLinkedList {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        int a = inp.nextInt();
        while (a != -1) {
            arr.add(a);
            a = inp.nextInt();
        }
        int k = inp.nextInt();
        System.out.println(arr.get(arr.size() - k));
    }
}
