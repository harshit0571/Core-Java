
import java.util.Arrays;

class Demo2 {

    static void conquer(int arr[], int start, int mid, int end) {

        int n1 = mid - start + 1;

        int n2 = end - mid;

        int[] arr1 = new int[n1];

        int[] arr2 = new int[n2];

        int k = 0;

        for (int i = start; i <= mid; i++) {

            arr1[k] = arr[i];

            k++;

        }

        k = 0;

        for (int i = mid + 1; i <= end; i++) {

            arr2[k] = arr[i];

            k++;

        }

        int ptr1 = 0;

        int ptr2 = 0;

        int output[] = new int[n1 + n2];

        int outputIndex = 0;

        while (ptr1 < n1 && ptr2 < n2) {

            if (arr1[ptr1] < arr2[ptr2]) {

                output[outputIndex] = arr1[ptr1];

                ptr1++;

                outputIndex++;

            } else {

                output[outputIndex] = arr2[ptr2];

                ptr2++;

                outputIndex++;

            }

        }

        while (ptr1 < n1) {

            output[outputIndex] = arr1[ptr1];

            ptr1++;

            outputIndex++;

        }

        while (ptr2 < n2) {

            output[outputIndex] = arr2[ptr2];

            ptr2++;

            outputIndex++;

        }

        outputIndex = 0;

        for (int i = start; i <= end; i++) {

            arr[i] = output[outputIndex];

            outputIndex++;

        }

        // System.out.println("Sorted #: " + Arrays.toString(output));

    }

    static void printArr(int arr[], int start, int end) {

        for (int i = start; i <= end; i++) {

            System.out.print(arr[i] + " ");

        }

        System.out.println();

    }

    static void divide(int arr[], int start, int end) {

        printArr(arr, start, end);

        if (start == end) {

            return;

        }

        int mid = (start + end) / 2;

        divide(arr, start, mid);

        divide(arr, mid + 1, end);

        conquer(arr, start, mid, end);

    }

    public static void main(String[] args) {

        int arr[] = new int[] { 12, 51, 21, 756, 23, 978, 231, 686 };

        divide(arr, 0, arr.length - 1);

        System.out.println(Arrays.toString(arr));

    }

}
