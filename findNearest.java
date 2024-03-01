import java.util.Scanner;

public class findNearest {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = inp.nextInt();
        }
        int t = inp.nextInt();

        int l = 0;
        int h = n - 1;
        int nearest = Integer.MAX_VALUE;

        while (l <= h) {
            int mid = (h - l) / 2 + l;

            if (arr[mid] == t) {
                nearest = arr[mid];
                break;
            } else if (arr[mid] > t) {
                h = mid - 1;
            } else {
                l = mid + 1;
            }

            if (Math.abs(arr[mid] - t) < Math.abs(nearest - t)) {
                nearest = arr[mid];
            }
        }
        System.out.println("Nearest element to " + t + " is: " + nearest);
    }
}
