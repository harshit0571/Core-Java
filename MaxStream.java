import java.util.Scanner;

public class MaxStream {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int max = n;
        while (n != -1) {
            max = Math.max(n, max);
            System.out.println("max element is: " + max);
            n = inp.nextInt();
        }
    }
}