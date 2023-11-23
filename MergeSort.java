import java.util.Arrays;

public class MergeSort {
    static int[] Conquer(int[] arr1, int[] arr2) {
        int[] arr = new int[arr1.length + arr2.length];
        int one = 0;
        int two = 0;
        int i = 0;
        while (one < arr1.length && two < arr2.length) {
            if (arr1[one] < arr2[two]) {
                arr[i] = arr1[one];
                one++;
            } else {
                System.out.println(arr2[two]);
                arr[i] = arr2[two];
                two++;
            }
            i++;
        }
        while (one < arr1.length) {
            arr[i] = arr1[one];
            one++;
            i++;
        }
        while (two < arr2.length) {
            arr[i] = arr2[two];
            two++;
            i++;
        }
        return arr;
    }

    static void print(int arr[], int start, int end) {
        for (int i = start; i <= end; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void divide(int arr[], int start, int end) {
        print(arr, start, end);
        if (start == end) {
            return;
        }
        int mid = (start + end) / 2;
        divide(arr, start, mid);
        divide(arr, mid + 1, end);

    }

    public static void main(String[] args) {
        int[] arr = new int[] { 12, 53, 3, 21, 44 };
        divide(arr, 0, arr.length - 1);

    }

}
