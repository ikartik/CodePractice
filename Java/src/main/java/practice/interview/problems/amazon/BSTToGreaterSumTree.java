package practice.interview.problems.amazon;

public class BSTToGreaterSumTree {

    static int sum = 0;

    static class Node {
        Node left, right;
        int data;

        Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    public static void main(String[] args) {

        Node root = new Node(11);
        root.left = new Node(2);
        root.right = new Node(29);
        root.left.left = new Node(1);
        root.left.right = new Node(7);
        root.right.left = new Node(15);
        root.right.right = new Node(40);
        root.right.right.left = new Node(35);

        printInorder(root);
        System.out.println("");

        transform(root);

//        int sum = getSumOfTree(root);
//        tryIt(root, sum);
        printInorder(root);
        int val = 115 & 15;
        System.out.println(val);

    }

    static void tryIt(Node root, int sum) {

        if(root == null)
            return;

        tryIt(root.left, sum);
        root.data = sum - root.data;
        sum = root.data;
        tryIt(root.right, sum);
    }

    static int getSumOfTree(Node root) {

        if (root == null)
            return 0;

        return (root.data + getSumOfTree(root.left) + getSumOfTree(root.right));
    }

    static void printInorder(Node root) {
        if (root == null)
            return;

        printInorder(root.left);
        System.out.print(" " + root.data);
        printInorder(root.right);
    }

    static void transform(Node root) {
        transformRec(root);
    }

    static void transformRec(Node root) {

        if (root == null)
            return;

        transformRec(root.right);
        sum = sum + root.data;
        root.data = sum - root.data;
        transformRec(root.left);

    }

}
