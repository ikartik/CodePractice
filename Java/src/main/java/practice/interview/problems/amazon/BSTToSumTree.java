package practice.interview.problems.amazon;

public class BSTToSumTree {

    static class Node {
        int data;
        Node left, right;

        Node(int item) {
            data = item;
            left = right = null;
        }
    }


    // Convert a given tree to a tree where every node contains sum of
    // values of nodes in left and right subtrees in the original tree
    static int toSumTree(Node node) {
        // Base case
        if (node == null)
            return 0;

        // Store the old value
        int old_val = node.data;

        // Recursively call for left and right subtrees and store the sum
        // as new value of this node
        node.data = toSumTree(node.left) + toSumTree(node.right);

        // Return the sum of values of nodes in left and right subtrees
        // and old_value of this node
        return node.data + old_val;
    }

    // A utility function to print inorder traversal of a Binary Tree
    static void printInorder(Node node) {
        if (node == null)
            return;
        printInorder(node.left);
        System.out.print(node.data + " ");
        printInorder(node.right);
    }

    /* Driver function to test above functions */
    public static void main(String args[]) {
        Node tree = new Node(1);
        tree.left = new Node(-2);
        tree.right = new Node(6);
        tree.left.left = new Node(8);
        tree.left.right = new Node(-4);
        tree.right.left = new Node(7);
        tree.right.right = new Node(5);

        toSumTree(tree);

        // Print inorder traversal of the converted tree to test result
        // of toSumTree()
        System.out.println("Inorder Traversal of the resultant tree is:");
        printInorder(tree);
    }

}
