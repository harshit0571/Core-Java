import java.util.Scanner;

public class LL_K {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int k = inp.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = inp.nextInt();
        }
        int left = 0;
        int right = k - 1;
        int i = 0;
        while (i < arr.length) {
            left = i;
            right = i + k - 1;
            while (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
            i = i + k;
        }
        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[i]);
        }
    }
}
