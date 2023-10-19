import java.util.ArrayList;
import java.util.Scanner;

public class Lexi {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        String a = sc.next();
        ArrayList<String> list = new ArrayList<>();
        String arr[] = s.split(" ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].compareTo(a) > 0) {
                list.add(arr[i]);

            }

        }
        System.out.println(list);

    }

}