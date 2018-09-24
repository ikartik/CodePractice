package practice.interview.problems.yatra;

import practice.problems.graphs.TreeNode;

import java.util.Stack;

/**
 * Created by kartik on 15/09/17.
 */
public class PrintSpiralTree {

    public static void main(String[] args) {

        //             1
        //          /     \
        //        2        3
        //      /  \     /   \
        //    7    6     5     4
        //  / \   / \   /  \  / \
        // 8  9  10 11 12 13 14 15

        TreeNode tree = new TreeNode(1);
        tree.left = new TreeNode(2);
        tree.right = new TreeNode(3);
        tree.right.right = new TreeNode(4);
        tree.right.left = new TreeNode(5);
        tree.left.right = new TreeNode(6);
        tree.left.left = new TreeNode(7);
        tree.left.left.left = new TreeNode(8);
        tree.left.left.right = new TreeNode(9);
        tree.left.right.left = new TreeNode(10);
        tree.left.right.right = new TreeNode(11);
        tree.right.left.left = new TreeNode(12);
        tree.right.left.right = new TreeNode(13);
        tree.right.right.left = new TreeNode(14);
        tree.right.right.right = new TreeNode(15);

        printSpiral(tree);

    }

    static void printSpiral(TreeNode root){

        if(root == null)
            return;

        Stack<TreeNode> s1 = new Stack<TreeNode>();
        Stack<TreeNode> s2 = new Stack<TreeNode>();

        s1.push(root);

        while(!s1.isEmpty() || !s2.isEmpty()){

            while(!s1.isEmpty()){
                TreeNode temp = s1.peek();
                s1.pop();
                System.out.print(temp.value + " ");
                if(temp.right != null)
                    s2.push(temp.right);
                if(temp.left != null)
                    s2.push(temp.left);
            }

            while(!s2.isEmpty()){
                TreeNode temp = s2.peek();
                s2.pop();
                System.out.print(temp.value + " ");
                if(temp.left != null)
                    s1.push(temp.left);
                if(temp.right != null)
                    s1.push(temp.right);
            }

        }

    }

}
