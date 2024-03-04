import java.util.HashMap;
import java.util.Scanner;

public class INterview {

    static boolean checkPali(String s) {
        int i = 0;
        int e = s.length() - 1;
        if (s.length() < 1) {
            return false;
        }
        while (i < e) {
            if (s.charAt(i) != s.charAt(e)) {
                return false;
            }
            i++;
            e--;
        }
        return true;
    }

    static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(-1);

        Node temp = head;
        int i = 0;
        while (i < 5) {
            temp.next = new Node(i);
            temp = temp.next;
            i++;
        }
        head = head.next;
        // while (head != null) {
        // System.out.println(head.val);
        // head = head.next;
        // }

        int n = 7;
        i = 1;
        Node temp2 = head;
        while (i < n - 1 && temp2.next != null) {
            temp2 = temp2.next;
            i++;
        }

        if (temp2.next != null) {
            temp2.next = temp2.next.next;
        } else {
            temp2.next = null;
        }

        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }

    }
}
