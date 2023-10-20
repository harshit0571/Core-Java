import java.util.*;

public class Contact {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String name[] = new String[n];
        String phone[] = new String[n];
        String email[] = new String[n];
        for (int i = 0; i < n; i++) {
            name[i] = sc.next();
            phone[i] = sc.next();
            email[i] = sc.next();

        }
        String ne = sc.next();
        int found = 0;
        for (int i = 0; i < n; i++) {
            if (name[i].compareTo(ne) == 0) {
                System.out.println(name[i]);
                System.out.println(phone[i]);
                System.out.println(email[i]);
                found = 1;
                break;
            }
        }
        if (found == 0) {
            System.out.println("-1");
        }

    }
}