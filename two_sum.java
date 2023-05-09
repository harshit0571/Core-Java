import java.util.Scanner;

public class two_sum {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = inp.nextInt();
        }
        int k = inp.nextInt();

        int sum = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            sum = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                sum = sum + arr[j];

                if (sum == k) {
                    System.out.println(i + " " + j);
                }
                sum = arr[i];
            }
        }
    }
}
