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
        ArrayList<String> arr = new ArrayList<>();
        int n = inp.nextInt();
        inp.nextLine();
        for (int index = 0; index < n; index++) {
            String a = inp.nextLine();
            arr.add(a);
        }

        ArrayList<String> ans = new ArrayList<>();
        for (int index = 0; index < n; index++) {
            boolean isThere = search(ans, arr.get(index));
            System.out.println(isThere);

            if (isThere == false) {
                ans.add(arr.get(index));
            }
        }
        System.out.println(ans.size());

    }
}

// aman harshit aman
// ans : aman , harshit,