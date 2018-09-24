package practice.problems.tree;

public class BTreeLeftView {

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

        printLeftView(tree);

    }

    static void printLeftView(TreeNode tree){
        printLeftView(tree, 1);
    }

    static void printLeftView(TreeNode tree, int level){
        if(tree == null)
            return;

        if(level > max_level){
            System.out.printf(" " + tree.key);
            max_level = level;
        }

        printLeftView(tree.left, level+1);
        printLeftView(tree.right, level+1);
    }

}
