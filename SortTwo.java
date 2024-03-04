import java.util.Scanner;

public class SortTwo {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();

        String[] arr1 = new String[n];
        int[] arr2 = new int[n];

        for (int i = 0; i < n; i++) {
            arr1[i] = inp.next();
            arr2[i] = inp.nextInt();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (arr1[j + 1].compareTo(arr1[j]) < 1) {
                    String temp = arr1[j];
                    arr1[j] = arr1[j + 1];
                    arr1[j + 1] = temp;

                    int t = arr2[j];
                    arr2[j] = arr2[j + 1];
                    arr2[j + 1] = t;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.println(arr1[i] + " " + arr2[i]);
        }

    }
}
