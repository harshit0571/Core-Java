import java.util.Scanner;

public class StringRevSpacesReserve {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String str = inp.nextLine();
        String arr[] = str.split(" ");
        for (int i = 0; i < arr.length; i++) {
            StringBuilder sb = new StringBuilder(arr[i]);
            arr[i] = sb.reverse().toString();
        }
        String ans = "";
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                ans += arr[i];
            } else {
                ans += arr[i] + " ";
            }
        }
        System.out.println(ans);
    }
}
