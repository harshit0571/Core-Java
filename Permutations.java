import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Permutations {
    public static List<String> subsequences(String str) {
        List<String> arr = new ArrayList<>();
        arr.add("");

        for (int i = 0; i < str.length(); i++) {
            int size = arr.size();
            for (int j = 0; j < size; j++) {
                arr.add(arr.get(j) + str.charAt(i));
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String str = inp.nextLine();
        List<String> arr = subsequences(str);

        System.out.println("Subsequences of " + str + ":");
        for (int i = 1; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }
    }
}
