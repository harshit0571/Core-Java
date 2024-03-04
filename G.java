
import java.util.Scanner;

class node {
    int val;
    node next;

    node(int val) {
        this.val = val;
        next = null;
    }
}

public class G {
    public static node inp() {
        System.out.println("Enter num");
        Scanner sc = new Scanner(System.in);
        node head = new node(-1);
        node curr = head;
        int n = sc.nextInt();
        while (n != -1) {
            node temp = new node(n);
            curr.next = temp;
            curr = curr.next;
            n = sc.nextInt();
        }
        return head.next;
    }

    public static void print(node head) {
        node temp = head;
        while (temp != null) {
            System.out.println(temp.val);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        node h = inp();
        print(h);
    }
}
