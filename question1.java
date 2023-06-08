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
        String s = inp.nextLine();
        String d = inp.nextLine();
        char[] ans = s.toCharArray();
        char[] arr = d.toCharArray();
        String a = "";
        for (int i = 0; i < arr.length && i < ans.length; i++) {
            if (arr[i] == ans[i]) {
                a = a + arr[i];
            } else {
                break;
            }
        }
        System.out.println(a);
    }
}

// instruction cycle
// interupt cycle
// timming contril
// bus dia
// type of
// instruction
// moris
// ke akhri 10;

// aman harshit aman
// ans : aman , harshit,
