import java.util.Scanner;

public class HouseSearch {
    static boolean check(int i) {
        int n = i;
        n = (n - 2) / 3;
        if (n == 1) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int m = inp.nextInt();
        int count = 0;
        int i = 1;
        while (count < n) {

            if (check(i)) {

                System.out.println(count);
                count++;
            }
            i++;
        }
    }
}
