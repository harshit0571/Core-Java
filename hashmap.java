import java.util.*;

public class hashmap {
    public static void main(String args[]) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("usa", 12);
        map.put("france", 99);
        map.put("india", 123);
        map.put("usa", 52);
        map.containsKey("uae");
        map.size();
        System.out.println(map.get("usa"));
    }
}
