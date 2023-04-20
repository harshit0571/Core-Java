import java.util.Scanner;

public class pattern2 {
    static int dec(int a) {
        boolean flag = false;
        int count = 0;
        int sum = 0;
        while (a > 0) {
            int temp = a % 2;
            if (temp == 0 && flag == false) {
                count++;
            } else {
                flag = true;
            }
            sum = sum * 10 + temp;
            a = a / 2;
        }
        while (count > 0) {
            sum = sum * 10;
            count--;
        }

        return sum;
    }

    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);
        int a = inp.nextInt();
        int k = 1;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                int t = dec(k);
                System.out.print(t + " ");
                k++;
            }
            System.out.println();
        }
    }
}
