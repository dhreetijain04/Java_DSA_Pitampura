package WEEK14;

import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

public class binarytrees {
    public class Node {
        int val;
        Node left;
        Node right;
    }

    Node root;
    Scanner sc = new Scanner(System.in);

    public binarytrees() {
        root = createTree();
    }

    public Node createTree() {
        System.out.println("value : ");
        int item = sc.nextInt();
        Node nn = new Node();
        nn.val = item;

        System.out.println("has left?");
        boolean hlc = sc.nextBoolean();
        if (hlc) {
            nn.left = createTree();
        }
        System.out.println("has right?");
        boolean hrc = sc.nextBoolean();
        if (hrc) {
            nn.right = createTree();
        }
        return nn;
    }

    public void Display() {
        display(root);
    }

    public void display(Node nn) {
        if (nn == null) {
            return;
        }
        String output = " ";
        output = "<--" + nn.val + "-->";

        if (nn.left == null) {
            output = "Null" + output;
        } else {
            output = nn.left.val + output;
        }
        if (nn.right == null) {
            output = "Null";
        } else {
            output += nn.right.val;
        }
        System.out.println(output);
        display(nn.left);
        display(nn.right);
    }

    public int findmax(Node root) {
        if (root == null)
            return -1;
        return Math.max(
                root.val,
                Math.max(findmax(root.left), findmax(root.right)));
    }

    public boolean finditem(Node root, int item) {
        if (root == null) {
            return false;
        }
        if (root.val == item) {
            return true;
        }
        boolean left = finditem(root.left, item);
        boolean right = finditem(root.right, item);
        return (left || right);
    }

    public int height(Node root) {
        if (root == null) {
            return 0;
        }
        int left = height(root.left);
        int right = height(root.right);
        return Math.max(left, right) + 1;
    }

    public void infix(Node root) {
        if (root == null) {
            return;
        }
        infix(root.left);
        System.out.print(root.val + " ");
        infix(root.right);
    }

    public void prefix(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.val + " ");
        prefix(root.left);
        prefix(root.right);
    }

    public void postfix(Node root) {
        if (root == null) {
            return;
        }
        postfix(root.left);
        postfix(root.right);
        System.out.print(root.val + " ");
    }

    public void leveordertrav() {
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            Node rv = q.remove();
            System.out.print(rv.val + " ");
            if (rv.left != null) {
                q.add(rv.left);
            }
            if (rv.right != null) {
                q.add(rv.right);
            }
        }
        System.out.println();
    }

}
