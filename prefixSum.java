import java.util.Scanner;

public class prefixSum {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int[] arr = new int[n];
        int[] sumArray = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = inp.nextInt();
            sum += arr[i];
            sumArray[i] = sum;
        }

        for (int i = 0; i < sumArray.length; i++) {
            System.out.println(sumArray[i] + " ");
        }
    }
}
