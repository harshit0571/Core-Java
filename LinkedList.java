import java.util.Scanner;

public class LinkedList {
    static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    static void check(Node temp) {
        Node curr = temp;
        Node prev = temp;
        while (curr != null && curr.next != null) {
            curr = curr.next.next;
            prev = prev.next;
        }
        System.out.println(prev.val);
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        Node head = new Node(-1);
        Node temp = head;

        int n = inp.nextInt();
        while (n != -1) {
            temp.next = new Node(n);
            temp = temp.next;
            n = inp.nextInt();
        }

        head = head.next;
        check(head);
    }
}
