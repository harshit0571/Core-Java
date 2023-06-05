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
        ArrayList<Integer> arr = new ArrayList<>();
        int n = inp.nextInt();
        inp.nextLine();
        for (int index = 0; index < n; index++) {
            int a = inp.nextInt();
            arr.add(a);
        }
        Collections.sort(arr);
        System.out.println(arr);

    }
}

// aman harshit aman
// ans : aman , harshit,