package practice.problems.tree;

public class BTreeRightView {

    static int max_level = 0;

    static class TreeNode{
        TreeNode left;
        TreeNode right;
        int key;
        TreeNode(int key){
            this.key = key;
            this.left = null;
            this.right = null;
        }
    }

    public static void main(String[] args) {

        TreeNode tree = new TreeNode(15);
        tree.left = new TreeNode(12);
        tree.right = new TreeNode(16);
        tree.left.left = new TreeNode(4);
        tree.left.right = new TreeNode(13);
        tree.left.right.left = new TreeNode(11);
        tree.right.right = new TreeNode(20);
        tree.right.right.left = new TreeNode(19);
        tree.right.right.right = new TreeNode(21);
        tree.right.right.left.left = new TreeNode(18);

        printRightView(tree);

    }

    static void printRightView(TreeNode tree){
        printRightView(tree, 1);
    }

    static void printRightView(TreeNode tree, int level){
        if(tree == null)
            return;

        if(level > max_level){
            System.out.printf(" " + tree.key);
            max_level = level;
        }

        printRightView(tree.right, level + 1);
        printRightView(tree.left, level + 1);
    }

}
