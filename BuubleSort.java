import java.util.Arrays;

public class BuubleSort {
    static void Bubble(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    static void Selection(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

    }

    static void Insertion(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int j = i;
            int temp = arr[i + 1];
            while (j >= 0 && temp < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }
        System.out.println(Arrays.toString(arr));

    }

    public static void main(String[] args) {
        int arr[] = { 4, 6, 8, 1, 0, 2 };
        Bubble(arr);
        Selection(arr);
        Insertion(arr);
    }
}
