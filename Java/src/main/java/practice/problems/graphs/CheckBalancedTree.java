package practice.problems.graphs;

/**
 * Created by kartik on 09/09/17.
 */
public class CheckBalancedTree { // Height difference between two subtrees never exceeds 1.

    public static void main(String[] args) {

        TreeNode tree = new TreeNode(4);
        tree.left = new TreeNode(2);
        tree.right = new TreeNode(6);
        tree.left.left = new TreeNode(1);
        tree.left.right = new TreeNode(3);
        tree.right.left = new TreeNode(5);
        tree.right.right = new TreeNode(7);


    }

    static boolean checkBalanced(TreeNode tree){
        int result = checkRecursive(tree);
        System.out.println("Height : " + result);
        return result != Integer.MIN_VALUE;
    }

    static int checkRecursive(TreeNode root){
        if(root == null)
            return -1;

        int leftHeight = checkRecursive(root.left);
        if(leftHeight == Integer.MIN_VALUE)
            return Integer.MIN_VALUE;

        int rightHeight = checkRecursive(root.right);
        if(rightHeight == Integer.MIN_VALUE)
            return Integer.MIN_VALUE;

        int heightDiff = Math.abs(leftHeight - rightHeight);
        if(heightDiff > 1)
            return Integer.MIN_VALUE;
        else
            return Math.max(leftHeight, rightHeight) + 1;

    }
}
