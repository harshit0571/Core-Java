import java.util.Scanner;

public class LeftRightDiff {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = inp.nextInt();
        }
        int[] leftArray = new int[n];
        int left = 0;
        for (int i = 0; i < n; i++) {
            leftArray[i] = left;
            left += arr[i];
        }
        int[] rightArray = new int[n];
        int right = 0;
        for (int i = n - 1; i >= 0; i--) {
            rightArray[i] = right;
            right += arr[i];
        }

        for (int i = 0; i < n; i++) {
            int sum = rightArray[i] - leftArray[i];

            if (sum < 0) {
                sum *= -1;
                System.out.print(sum + " ");
            } else {
                System.out.print(sum + " ");
            }
        }

    }
}

//
