package practice.problems.graphs;

import java.util.ArrayList;

/**
 * Created by kartik on 09/09/17.
 */
public class CheckIfBTisBST {

    static int index = 0;

    public static void main(String[] args) {

        TreeNode tree = new TreeNode(4);
        tree.left = new TreeNode(2);
        tree.right = new TreeNode(6);
        tree.left.left = new TreeNode(1);
        tree.left.right = new TreeNode(3);
        tree.right.left = new TreeNode(5);
        tree.right.right = new TreeNode(8);

        System.out.println(checkBST(tree));


    }

    static boolean checkBST(TreeNode root) {
        ArrayList<Integer> arr = new ArrayList();
        inOrder(root, arr);

        for(int i=0; i<arr.size()-1; i++){
            if(arr.get(i) >= arr.get(i+1))
                return false;
        }
        return true;
    }

    static void inOrder(TreeNode root, ArrayList<Integer> arr){
        if(root == null)
            return;
        inOrder(root.left, arr);
        arr.add(root.value);
        inOrder(root.right, arr);
    }

}
