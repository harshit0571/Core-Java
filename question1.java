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
            String s = inp.next();
            arr.add(s);
        }
        inp.nextLine();
        String k = inp.nextLine();
        ArrayList<String> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (k.compareTo(arr.get(i)) <= 0) {
                ans.add(arr.get(i));
            }
        }
        System.out.println(ans);

    }
}

// aman harshit aman
// ans : aman , harshit,