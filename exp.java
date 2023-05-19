import java.util.Scanner;

public class exp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String str1 = sc.next();
        boolean flag = false;
        boolean flag2 = false;
        int a = 0, b = 0;
        try {
            try {
                a = Integer.parseInt(str);
                flag = true;
            } catch (Exception e) {
                System.out.println(str);
            }
            try {
                b = Integer.parseInt(str1);
                flag2 = true;
            } catch (Exception f) {
                System.out.println(str1);
            }

            if (flag && flag2) {
                System.out.println(a + b);
            }
        } catch (Exception e) {

        }
    }
}
