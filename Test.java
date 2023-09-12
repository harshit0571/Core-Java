import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();

        String[] name = new String[n];

        String[] email = new String[n];

        String[] phone = new String[n];

        for (int i = 0; i < n; i++) {
            name[i] = inp.next();
            email[i] = inp.next();
            phone[i] = inp.next();
        }

        for (int i = 0; i < n; i++) {
            System.out.println(name[i] + " " + phone[i]);
        }

    }
}
