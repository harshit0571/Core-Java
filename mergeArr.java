import java.util.Scanner;

public class mergeArr {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = inp.nextInt();
        }
        int m = inp.nextInt();
        int[] arr2 = new int[m];
        for (int i = 0; i < m; i++) {
            arr2[i] = inp.nextInt();
        }

        int[] ans = new int[m + n];

        int k = 0;
        int j = 0;
        int i = 0;

        while (k < n && j < m) {
            if (arr1[k] < arr2[j]) {
                ans[i] = arr1[k];
                k++;
                i++;
            } else {
                ans[i] = arr2[j];
                j++;
                i++;
            }
        }

        while (k < n) {
            ans[i] = arr1[k];
            k++;
            i++;
        }

        while (j < m) {
            ans[i] = arr2[j];
            j++;
            i++;
        }

        for (int l = 0; l < ans.length; l++) {
            System.out.print(ans[l] + " ");
        }

    }
}
