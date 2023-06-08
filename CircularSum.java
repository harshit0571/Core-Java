import java.util.Scanner;

public class CircularSum {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int arr[] = new int[n];
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = inp.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j <= arr.length; j++) {

                if (j == arr.length) {
                    j = 0;
                    while (j < i) {
                        sum = sum + arr[j];
                        max = Math.max(max, sum);
                        j++;
                    }
                    break;
                } else {
                    System.out.println(i + " " + j + " " + sum);
                    sum = sum + arr[j];
                    max = Math.max(sum, max);
                }
            }
            sum = 0;
            System.out.println(max);
        }

        System.out.println(max);
    }
}
