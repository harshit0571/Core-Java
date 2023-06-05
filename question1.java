import java.applet.Applet;
import java.util.*;

public class question1 {
    static boolean search(ArrayList<String> arr, String str) {
        for (int i = 0; i < arr.size(); i++) {
            if (str.equals(arr.get(i))) {
                return true;
            }
            ;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        inp.nextLine();
        ArrayList<String> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String s = inp.nextLine();
            arr.add(s);
        }
        String k = inp.nextLine();
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            String str = arr.get(i).substring(0, k.length());
            System.out.println(str);
            if (str.equals(k)) {
                count++;
            }
        }
        System.out.println(count);
    }
}

// aman harshit aman
// ans : aman , harshit,