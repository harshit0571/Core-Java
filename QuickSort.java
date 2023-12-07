
import java.util.Arrays;

class Demo2 {

    static int findPivot(int arr[], int start, int end) {

        // Select a Pivot Element

        int pivot = arr[end];

        int findSmallerEqual = start; // blue

        int largeValue = start - 1; // red

        while (findSmallerEqual <= end) {

            // find the value that is less than equal to Pivot

            while (findSmallerEqual <= end && arr[findSmallerEqual] > pivot) {

                findSmallerEqual++;

            }

            System.out.println(findSmallerEqual);

            // increment second pointer

            largeValue++;

            // swap

            int temp = arr[findSmallerEqual];

            arr[findSmallerEqual] = arr[largeValue];

            arr[largeValue] = temp;

            findSmallerEqual++;

        }

        return largeValue;

    }

    static void QuickSort(int arr[], int start, int end) {

        if (start >= end) {

            return;

        }

        System.out.println("Start : " + start + " End : " + end);

        int pivotIndex = findPivot(arr, start, end);

        System.out.println(Arrays.toString(arr));

        System.out.println("Pivot Index : " + pivotIndex);

        QuickSort(arr, start, pivotIndex - 1); // left sub -array

        QuickSort(arr, pivotIndex + 1, end); // right sub -array

    }

    public static void main(String[] args) {

        int arr[] = new int[] { 10, 30, 20, 40, 70, 35 };

        System.out.println("Original Array : " + Arrays.toString(arr));

        QuickSort(arr, 0, arr.length - 1);

    }

}