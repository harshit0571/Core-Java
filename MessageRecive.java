import java.util.Scanner;

public class MessageRecive {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String str = inp.nextLine();
        str = str.trim();
        String[] arr = str.split(" ");
        String ans = "";
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i].trim();
            ans = ans + arr[i];
        }
        System.out.println(ans);

    }
}
