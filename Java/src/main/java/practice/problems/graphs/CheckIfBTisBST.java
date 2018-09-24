package practice.problems.graphs;

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
        tree.right.right = new TreeNode(7);

        System.out.println(check(tree));


    }

    static void checkRec(TreeNode root, int arr[]){
        if(root == null)
            return ;
        checkRec(root.left, arr);
        arr[index++] = root.value;
        checkRec(root.right, arr);
    }

    static boolean check(TreeNode tree){

        int[] arr = new int[7];

        checkRec(tree, arr);

        int i = 0;
        while(i < arr.length-1){
            if(arr[i] > arr[i+1])
                return false;
            i++;
        }
        return true;
    }

}
