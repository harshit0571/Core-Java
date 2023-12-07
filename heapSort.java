
import java.util.Arrays;

class Demo2 {

    static void heapify(int[] arr, int N, int parentIndex) {

        int leftChild = 2 * parentIndex + 1;

        int rightChild = 2 * parentIndex + 2;

        int largestKaIndex = parentIndex;

        if (leftChild < N && arr[leftChild] > arr[parentIndex]) {

            largestKaIndex = leftChild;

        }

        if (rightChild < N && arr[rightChild] > arr[largestKaIndex]) {

            largestKaIndex = rightChild;

        }

        if (largestKaIndex == parentIndex) {

            // do nothing

            // Parent is the Largest

            return;

        } else {

            // Parent is not the Largest

            int temp = arr[parentIndex];

            arr[parentIndex] = arr[largestKaIndex];

            arr[largestKaIndex] = temp;

            // recursive call to check the Max-Heap Relation

            heapify(arr, N, largestKaIndex);

        }

    }

    public static void main(String[] args) {

        int arr[] = new int[] { 27, 42, 13, 9, 51, 96 };

        int N = arr.length;

        System.out.println("Original Array : " + Arrays.toString(arr));

        for (int i = (N - 1) / 2; i >= 0; i--) {

            heapify(arr, N, i);

        }

        System.out.println("Heapified Array : " + Arrays.toString(arr));

        // HeapSort

        // After Initial Heapify

        for (int i = N - 1; i >= 0; i--) {

            // swap arr[0] and arr[i]

            int temp = arr[0];

            arr[0] = arr[i];

            arr[i] = temp;

            heapify(arr, i, 0);

            System.out.println("Heap Sort Pass # : " + Arrays.toString(arr));

        }

    }

}