import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Btree {

    static class Node {
        int val;
        Node left;
        Node right;

        Node(int val) {
            this.val = val;
        }
    }

    static Node insert(Node root, int val) {
        if (root == null) {
            return new Node(val);
        }

        if (root.val > val) {
            root.left = insert(root.left, val);
        }
        if (root.val < val) {
            root.right = insert(root.right, val);
        }
        return root;
    }

    static void levelOrderTraversal(Node root) {
        if (root == null) {
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                Node temp = q.poll();
                System.out.print(temp.val + " ");
                if (temp.left != null) {
                    q.add(temp.left);
                }
                if (temp.right != null) {
                    q.add(temp.right);
                }
            }
            System.out.println();
        }

    }

    static int depth(Node root) {
        if (root == null) {
            return 0;
        }
        int left = depth(root.left);
        int right = depth(root.right);

        return Math.max(left, right) + 1;
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        Node root = null;
        int n = inp.nextInt();
        for (int i = 0; i < n; i++) {
            root = insert(root, inp.nextInt());
        }
        levelOrderTraversal(root);
        System.out.println(depth(root));

    }
}
