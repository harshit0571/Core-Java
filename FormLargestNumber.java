import java.util.Scanner;

public class FormLargestNumber {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = inp.next();
        }
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length - 1; j++) {
                String one = arr[j] + arr[j + 1];
                String two = arr[j + 1] + arr[j];
                if (one.compareTo(two) > 0) {
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        String ans = "";
        for (int i = arr.length - 1; i >= 0; i--) {
            ans += arr[i];
        }
        System.out.println(ans);
    }
}
