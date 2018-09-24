package practice.problems.graphs;

/**
 * Created by kartik on 09/09/17.
 */
public class CheckIfBTisBSTBest {

    public static void main(String[] args) {

        TreeNode tree = new TreeNode(4);
        tree.left = new TreeNode(2);
        tree.right = new TreeNode(6);
        tree.left.left = new TreeNode(1);
        tree.left.right = new TreeNode(3);
        tree.right.left = new TreeNode(5);
        tree.right.right = new TreeNode(7);

        System.out.println(check(tree));

    }

    static boolean check(TreeNode tree){
        return checkRec(null, null, tree);
    }

    static boolean checkRec(Integer min, Integer max, TreeNode tree){

        if(tree == null)
            return true;

        if((min != null && tree.value <= min) || (max != null && tree.value > max))
            return false;

        if((!checkRec(min, tree.value, tree.left)) || (!checkRec(tree.value, max, tree.right)))
            return false;

        return true;

    }

}
