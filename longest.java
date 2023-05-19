import java.util.*;

public class longest {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        HashMap<Character, Integer> map = new HashMap<>();
        String s = inp.nextLine();
        int start = 0;
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                start = Math.max(start, map.get(s.charAt(i)) + 1);

            }
            map.put(s.charAt(i), i);
            max = Math.max(max, i - start + 1);
        }
        System.out.println(max);
    }
}

// abcdafg
