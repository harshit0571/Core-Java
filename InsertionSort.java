public class InsertionSort {
    static void insertion (int[] arr) {
        for (int i = 0; i < arr.length 1; i++) {
            for (int j = i+1; j > 0; i--) {
                  if (arr[j] < arr[j-1]) {
                      swap(arr, j, j-1);
                  } else {
                      break;
                  }
            }
        }
    }

    public static void main(String[] args) {

    }
}
