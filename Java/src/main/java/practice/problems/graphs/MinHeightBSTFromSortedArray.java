package practice.problems.graphs;

/**
 * Created by kartik on 09/09/17.
 */
public class MinHeightBSTFromSortedArray {

    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5,6,7};

        TreeNode tree = createMinTree(arr, 0, arr.length-1);

        printTreeInOrder(tree);

    }

    public static TreeNode createMinTree(int[] arr, int start, int end){
        if(end < start)
            return null;

        int mid = (start+end)/2;
        TreeNode tree = new TreeNode(arr[mid]);
        tree.left = createMinTree(arr, start, mid-1);
        tree.right = createMinTree(arr, mid+1, end);

        return tree;

    }

    public static void printTreeInOrder(TreeNode tree){
        if(tree == null)
            return;
        printTreeInOrder(tree.left);
        System.out.print(tree.value + " ");
        printTreeInOrder(tree.right);
    }
}
