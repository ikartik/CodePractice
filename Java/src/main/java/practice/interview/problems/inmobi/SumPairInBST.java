package practice.interview.problems.inmobi;

import org.junit.Test;
import practice.problems.graphs.TreeNode;

import java.util.Stack;

/**
 * @author kartik sharma
 * @date 05/06/18
 */
public class SumPairInBST {

    @Test
    public void method() {

        TreeNode tree = new TreeNode(4);
        tree.left = new TreeNode(2);
        tree.right = new TreeNode(6);
        tree.left.left = new TreeNode(1);
        tree.left.right = new TreeNode(3);
        tree.right.left = new TreeNode(5);
        tree.right.right = new TreeNode(7);

        int x = 7;

        findInTree(tree, x);

    }

    public void findInTree(TreeNode root, int x) {

        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();

        inOrderRec(root, stack1);
        revInOrderRec(root, stack2);

        System.out.println(stack1);
        System.out.println(stack2);

    }


    void inOrderRec(TreeNode root, Stack<Integer> stack) {
        if (root == null)
            return;
        inOrderRec(root.left, stack);
        stack.push(root.value);
        inOrderRec(root.right, stack);
    }

    void revInOrderRec(TreeNode root, Stack<Integer> stack) {
        if (root == null)
            return;
        revInOrderRec(root.right, stack);
        stack.push(root.value);
        revInOrderRec(root.left, stack);
    }


}
