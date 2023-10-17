import java.util.ArrayList;
import java.util.Scanner;

public class StringQ3 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String s = inp.nextLine();
        // apple cherry bananan kiwi
        // cherry kiwi
        // hi hi hello hellohello punjab
        // Punjab
        String sb = inp.next();
        ArrayList<String> ans = new ArrayList<>();
        String[] arr = s.split(" ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].compareTo(sb) > 0) {
                ans.add(arr[i]);
            }
        }
        System.out.println(ans);
    }
}
