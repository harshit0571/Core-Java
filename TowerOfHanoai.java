import java.util.Scanner;

public class TowerOfHanoai {
    public static void tH(int n, char a, char b, char c) {
        if (n == 0) {
            return;
        }
        tH(n - 1, a, c, b);
        System.out.println(n + "[" + a + "->" + b + "]");
        tH(n - 1, c, b, a);
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        tH(n, 'a', 'b', 'c');
    }
}
