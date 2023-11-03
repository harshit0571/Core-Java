import java.util.Arrays;

public class InsertionSort {
    static void insertion(int[] arr) {
        for (int i = 0; i < a..rr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                } else {
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 41, 1, 89, 2 };
        insertion(arr);

    }
}
