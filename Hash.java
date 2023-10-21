import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Stack;

public class Hash {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        HashSet<Integer> set = new HashSet<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(5);

        map.put(1, 2);
        map.put(2, 2);
        map.put(4, 2);
        for (int i : map.keySet()) {
            System.out.println(map.get(i));
        }
    }
}
