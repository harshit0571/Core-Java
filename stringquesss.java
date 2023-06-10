import java.util.*;

public class stringquesss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String arr[] = str.split(" ");
        System.out.println("Length of string:" + arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i].charAt(0) + " " + (int) arr[i].charAt(0));
            System.out.println();
        }

    }
}
