import java.util.Scanner;

public class IndexValueSwap {
    static void Swap(int[] arr, int a, int i) {
        arr[a] = i;
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n;
        n = inp.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = inp.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            Swap(arr, arr[i], i);
        }
    }
}
