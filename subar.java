import java.util.*;

public class subar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int i = 0;
        int c = 0;
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (i = 0; i < arr.length; i++)

            for (int j = i; j < arr.length; j++) {

                for (int k = i; k <= j; k++) {
                    if (arr[k] >= 3) {
                        if (arr[k] % 2 != 0) {
                            c++;
                        }
                    }
                }

            }

        System.out.println(c);
    }
}