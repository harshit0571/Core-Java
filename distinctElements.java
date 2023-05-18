import java.util.HashSet;
import java.util.Scanner;

public class distinctElements {
    public static void main(String[] args) {
        HashSet<Character> set = new HashSet<>();
        Scanner inp = new Scanner(System.in);
        String s = inp.nextLine();
        for (int i = 0; i < s.length(); i++) {
            if (set.contains(s.charAt(i))) {
                set.remove(s.charAt(i));
            } else {
                set.add(s.charAt(i));
            }
        }
        for (char i : set) {
            System.out.println(i);
        }
    }
}
