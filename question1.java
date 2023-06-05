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
        String n = inp.nextLine();
        while (n.equals("-1") == false) {
            arr.add(n);
            n = inp.nextLine();
        }
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            int size = arr.get(i).length();
            max = Math.max(max, size);
        }
        System.out.println(max);

    }
}

// aman harshit aman
// ans : aman , harshit,