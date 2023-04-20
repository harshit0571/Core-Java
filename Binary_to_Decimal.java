import java.util.Scanner;

public class Binary_to_Decimal {

    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);
        int a = inp.nextInt();
        int sum = 0;
        int count = 0;
        boolean flag = false;
        while (a > 0) {
            int i = a % 2;
            if (i == 0 && flag == false) {
                count++;
            } else {
                flag = true;
            }
            sum = sum * 10 + i;
            a = a / 2;
        }
        while (count > 0) {
            sum = sum * 10;
            count--;
        }
        System.out.println(sum + " " + count);
    }
}
// 4 2 1
