import java.util.HashSet;
import java.util.Scanner;

public class CommonLL {
    static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        Node head = new Node(-1);
        Node temp = head;
        int n = inp.nextInt();

        int i = 0;
        int j = 0;
        while (i < n) {
            temp.next = new Node(inp.nextInt());
            temp = temp.next;
            i++;
        }
        head = head.next;
        Node head2 = new Node(-1);
        Node temp2 = head2;
        int m = inp.nextInt();

        while (j < m) {
            temp2.next = new Node(inp.nextInt());
            temp2 = temp2.next;
            j++;
        }

        head2 = head2.next;

        HashSet<Integer> set = new HashSet<>();

        while (head != null) {
            set.add(head.val);
            head = head.next;
        }

        while (head2 != null) {
            if (set.contains(head2.val)) {
                System.out.print(head2.val + " ");
            }
            head2 = head2.next;
        }

    }
}
