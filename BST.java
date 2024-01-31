import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BST {
    static int diameter = 0;

    public static class Node {
        int val;
        Node left, right;

        Node(int val) {
            this.val = val;
        }
    }

    static Node insert(Node root, int val) {
        if (root == null) {
            return new Node(val);
        }

        if (val > root.val) {
            root.right = insert(root.right, val);
        } else {
            root.left = insert(root.left, val);
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

    static void inorder(Node root) {
        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }

    static void postorder(Node root) {
        if (root == null) {
            return;
        }

        postorder(root.left);
        postorder(root.right);
        System.out.print(root.val + " ");
    }

    static int height(Node root) {
        if (root == null) {
            return 0;
        }
        int left = height(root.left);
        int right = height(root.right);

        diameter = Math.max(diameter, left + right + 1);
        return Math.max(left, right) + 1;
    }

    static void levelOrder(Node root) {
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
        }
        return;
    }

    static void leftView(Node root) {
        if (root == null) {
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                Node temp = q.poll();
                if (i == 0) {
                    System.out.print(temp.val + " ");
                }

                if (temp.left != null) {
                    q.add(temp.left);
                }
                if (temp.right != null) {
                    q.add(temp.right);
                }
            }
        }
        return;
    }

    static void levelNode(Node root, int level) {
        if (root == null) {
            return;
        }

        if (level == 1) {
            System.out.print(root.val + " ");
            return;
        } else {
            if (root.left != null) {
                levelNode(root.left, level - 1);
            }
            if (root.right != null) {
                levelNode(root.right, level - 1);
            }
        }
    }

    static void leafNode(Node root) {
        if (root == null) {
            return;
        }

        if (root.left == null && root.right == null) {
            System.out.print(root.val + " ");
        } else {
            if (root.left != null) {
                leafNode(root.left);
            }
            if (root.right != null) {
                leafNode(root.right);
            }
        }
    }

    static Node lca(Node root, int p, int q) {
        if (root == null || root.val == p || root.val == q) {
            return root;
        }
        Node left = lca(root.left, p, q);
        Node right = lca(root.right, p, q);
        if (left == null) {
            return right;
        } else if (right == null) {
            return left;
        } else {
            return root;
        }

    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int[] arr = new int[n];
        Node root = null;
        for (int i = 0; i < arr.length; i++) {
            root = insert(root, inp.nextInt());
        }
        // preorder(root);
        // System.out.println();
        // inorder(root);
        // System.out.println();
        // postorder(root);
        // System.out.println("height: " + height(root) + " diameter: " + diameter);
        // levelOrder(root);
        // leftView(root);
        // levelNode(root, 3);
        // leafNode(root);
        System.out.println(lca(root, 25, 35).val);
    }
}
