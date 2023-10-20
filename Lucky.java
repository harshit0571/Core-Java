import java.util.Scanner;

public class Lucky {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int size = Integer.toString(n).length();
        int sum = 0;
        while (n > 0) {
            int i = n % 10;
            sum += Math.pow(i, size);
            n = n / 10;
        }
        System.out.println(sum);
    }
}