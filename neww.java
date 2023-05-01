import java.util.Scanner;

public class neww {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int k = obj.nextInt();
        long count = 0;
        int i = 1;
        while (n > 0) {
            int a = n % 2;
            System.out.println(a);
            // count = count + a * i;
            i = i * 10;
            n = n / 2;
            System.out.println("n->" + n);
        }
        System.out.println(count);
    }

}
