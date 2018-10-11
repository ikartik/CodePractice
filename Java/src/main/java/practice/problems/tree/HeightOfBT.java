package practice.problems.tree;

/**
 * @author kartik sharma
 * @date 11/10/18
 */
public class HeightOfBT {

    /*
        The height of a binary tree is the number of edges between the tree's root and its furthest leaf.
        For example, the following binary tree is of height 2 :

                       4
                      / \
                     2   6
                    /\   /\
                   1  3 5  7

    */

    static class Node {
        Node left;
        Node right;
        int data;

        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    static class Solution {
        public static int height(Node root) {
            return findHeight(root, -1);
        }

        static int findHeight(Node root, int height){
            if(root == null)
                return height;
            int left = findHeight(root.left, height + 1);
            int right = findHeight(root.right, height + 1);
            return Math.max(left, right);
        }
    }

    public static void main(String[] args) {

        Node root = new Node(4);
        root.left = new Node(2);
        root.right = new Node(6);
        root.left.left = new Node(1);
        root.left.right = new Node(3);
        root.right.left = new Node(5);
        root.right.right = new Node(7);

        int height = Solution.height(root);
        System.out.println(height);
    }

}
