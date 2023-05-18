import java.util.*;

public class anagram {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String a = inp.nextLine();
        String b = inp.nextLine();
        char[] a1 = a.toCharArray();
        char[] a2 = b.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);
        if (a1.length != a2.length) {
            System.out.println("false");
        } else {
            boolean flag = true;
            for (int i = 0; i < a2.length; i++) {
                if (a1[i] != a2[i]) {
                    flag = false;
                }
            }
            System.out.println(flag);
        }

    }
}
