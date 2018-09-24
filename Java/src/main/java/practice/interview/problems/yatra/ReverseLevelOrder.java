package practice.interview.problems.yatra;

import practice.problems.graphs.TreeNode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by kartik on 16/09/17.
 */
public class ReverseLevelOrder {

    public static void main(String[] args) {

        //            1
        //          /  \
        //        2     3
        //      /  \   / \
        //     4   5  6   7

        TreeNode tree = new TreeNode(1);
        tree.left = new TreeNode(2);
        tree.right = new TreeNode(3);
        tree.left.left = new TreeNode(4);
        tree.left.right = new TreeNode(5);
        tree.right.left = new TreeNode(6);
        tree.right.right = new TreeNode(7);

        printReverse(tree);

    }

    static void printReverse(TreeNode tree){
        if(tree == null)
            return;

        TreeNode node;

        Stack<TreeNode> stack = new Stack<TreeNode>();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();

        queue.add(tree);

        while(!queue.isEmpty()){

            node = queue.peek();
            queue.remove();
            stack.push(node);

            if(node.right != null)
                queue.add(node.right);
            if(node.left != null)
                queue.add(node.left);
        }

        while(!stack.isEmpty()){
            node = stack.peek();
            System.out.print(node.value + " ");
            stack.pop();
        }
    }

}
