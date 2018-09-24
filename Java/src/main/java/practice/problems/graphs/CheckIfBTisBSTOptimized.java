package practice.problems.graphs;

/**
 * Created by kartik on 09/09/17.
 */
public class CheckIfBTisBSTOptimized {

    static Integer lastOne = null;

    public static void main(String[] args) {

//        TreeNode tree = new TreeNode(4);
//        tree.left = new TreeNode(2);
//        tree.right = new TreeNode(6);
//        tree.left.left = new TreeNode(1);
//        tree.left.right = new TreeNode(3);
//        tree.right.left = new TreeNode(5);
//        tree.right.right = new TreeNode(7);

        TreeNode tree = new TreeNode(20);
        tree.left = new TreeNode(10);
        tree.left.right = new TreeNode(25);
        tree.right = new TreeNode(30);

        System.out.println(check(tree));

    }

    static boolean check(TreeNode tree){

        if(tree == null)
            return true;

        if(!check(tree.left))
            return false;

        if(lastOne != null && tree.value < lastOne)
            return false;
        lastOne = tree.value;

        if(!check(tree.right))
            return false;

        return true;
    }

}
