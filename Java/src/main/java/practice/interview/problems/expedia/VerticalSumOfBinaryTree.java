package practice.interview.problems.expedia;

import java.util.HashMap;
import java.util.Queue;

/**
 * @author kartik sharma
 * @date 20/04/18
 */
public class VerticalSumOfBinaryTree {

    // Given a binary tree, print the sum of all the nodes in vertical order
    /*
                1
              /   \
             2     3
           / \    / \
          4   5  6   7

    */

    public static void main(String[] args) {

        Tree tree = new Tree(1);
        tree.left = new Tree(2);
        tree.right = new Tree(3);
        tree.left.left = new Tree(4);
        tree.left.right = new Tree(5);
        tree.right.left = new Tree(6);
        tree.right.right= new Tree(7);

        HashMap<Integer, Integer> map  = new HashMap<Integer, Integer>();
        verticalSum(tree, 0, map);
        System.out.println(map);

    }

    static void verticalSum(Tree root, int hd, HashMap<Integer, Integer> map){
        if(root == null)
            return;

        map.put(hd, map.getOrDefault(hd, 0) + root.data);
        verticalSum(root.left, hd-1, map);
        verticalSum(root.right, hd+1, map);

    }

    static class Tree{
        int data;
        Tree left;
        Tree right;
        Tree(int data){
            this.data = data;
            this.left = this.right = null;
        }
    }

}
