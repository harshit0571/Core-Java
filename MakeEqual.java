import java.util.Scanner;

public class MakeEqual {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = inp.nextInt();
        }
        for (int i = 0; i < n; i++) {
            while (arr[i] % 2 == 0) {
                arr[i] = arr[i] / 2;
            }
            while (arr[i] % 3 == 0) {
                arr[i] = arr[i] / 3;
            }
        }
        boolean flag = true;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                flag = false;
                break;
            }
        }
        System.out.println(flag);

    }
}
