package practice.interview.problems.expedia;

/**
 * @author kartik sharma
 * @date 20/04/18
 */
public class MaximumSumPath {

    // Find the maximum sum leaf to root path in a Binary Tree

    /*
                  10
                /   \
	         -2      7
           /   \
	     8     -4
    */

    static class Tree{
        int data;
        Tree left;
        Tree right;
        Tree(int data){
            this.data = data;
            this.left = this.right = null;
        }
    }

    public static void main(String[] args) {
        Tree tree = new Tree(10);
        tree.left = new Tree(-2);
        tree.right = new Tree(7);
        tree.left.left = new Tree(8);
        tree.left.right = new Tree(-4);

//        Tree maxSumPathLeafNode = getTargetLeaf(tree);

    }

//    static Tree getTargetLeaf(Tree root){
//        if(root == null){
//
//        }
//    }

}
