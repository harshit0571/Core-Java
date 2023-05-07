import java.util.Scanner;

public class bit {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int k = inp.nextInt();
        while (k > 0) {
            int i = k;
            System.out.println(i);
            k = k >> 1;
        }

    }
}
