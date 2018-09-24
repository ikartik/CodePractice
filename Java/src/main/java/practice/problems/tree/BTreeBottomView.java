package practice.problems.tree;

import java.util.*;

public class BTreeBottomView {

    static SortedMap<Integer, Integer> map = new TreeMap<Integer, Integer>();

    static class TreeNode{
        TreeNode left;
        TreeNode right;
        int key;
        TreeNode(int key){
            this.key = key;
            this.left = null;
            this.right = null;
        }
    }

    public static void main(String[] args) {

        TreeNode tree = new TreeNode(15);
        tree.left = new TreeNode(12);
        tree.right = new TreeNode(16);
        tree.left.left = new TreeNode(4);
        tree.left.right = new TreeNode(13);
        tree.left.right.left = new TreeNode(11);
        tree.right.right = new TreeNode(20);
        tree.right.right.left = new TreeNode(19);
        tree.right.right.right = new TreeNode(21);
        tree.right.right.left.left = new TreeNode(18);

        printBottomViewRecursive(tree);

    }

    static void printBottomViewRecursive(TreeNode tree){
        bottomView(tree, 0);

        for(Integer key : map.keySet()){
            System.out.printf(" " + map.get(key));
        }
    }

    static void bottomView(TreeNode tree, int hd){
        if(tree == null)
            return;

        map.put(hd, tree.key);

        bottomView(tree.left, hd - 1);
        bottomView(tree.right, hd + 1);
    }
}
