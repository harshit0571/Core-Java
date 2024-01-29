import java.util.Scanner;

public class BInaryTree {

    public static class Node {
        Node left, right;
        int val;

        Node() {
        }

        Node(int val) {
            this.val = val;
        }
    }

    static Node insert(Node root, int val) {
        if (root == null) {
            return new Node(val);
        }
        if (val < root.val) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }
        return root;
    }

    static void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.val + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        Node root = new Node();
        for (int i = 0; i < n; i++) {
            insert(root, inp.nextInt());
        }
        preorder(root);
    }
}
