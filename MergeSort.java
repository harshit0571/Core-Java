import java.util.Arrays;

public class MergeSort {
    static int[] Merge(int[] arr1, int[] arr2) {
        int[] arr = new int[arr1.length + arr2.length];

        int one = 0;
        int two = 0;
        int i = 0;
        while (one < arr1.length && two < arr2.length) {
            if (arr1[one] < arr2[two]) {
                arr[i] = arr1[one];
                one++;
            } else {
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

    public static void main(String[] args) {
        int[] arr1 = new int[] { 1, 3, 5, 7 };
        int[] arr2 = new int[] { 2, 4, 6, 8 };
        int[] arr = Merge(arr1, arr2);
        System.out.println(Arrays.toString(arr));
    }
}
