import java.util.Scanner;

public class reverseSentence {
    static String rev(String s) {
        String[] arr = s.split(" ");
        String ans = "";
        for (int i = arr.length - 1; i >= 0; i--) {
            ans = ans + arr[i] + " ";
        } 

        return ans;
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String s = inp.nextLine();
        s = rev(s);
        System.out.println(s);

    }
}