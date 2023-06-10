import java.util.Scanner;

public class toggleCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char arr[] = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 'a' && arr[i] <= 'z') {
                arr[i] = (char) ((int) arr[i] - 32);
            } else if (arr[i] >= 'A' && arr[i] <= 'Z') {
                arr[i] = (char) ((int) arr[i] + 32);
            }
        }
        String ans = new String(arr);

        System.out.println(ans);
    }
}
