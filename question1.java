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
        String key[] = new String[n];
        int value[] = new int[n];
        inp.nextLine();
        for (int i = 0; i < value.length; i++) {
            String s = inp.next();
            int k = inp.nextInt();
            key[i] = s;
            value[i] = k;
            inp.nextLine();
        }
        int val = 0;
        String max = "";
        for (int i = 0; i < key.length; i++) {
            if (key[i].compareTo(max) > 0) {
                max = key[i];
                val = value[i];
            }
        }
        System.out.println(val);

    }
}

// aman harshit aman
// ans : aman , harshit,