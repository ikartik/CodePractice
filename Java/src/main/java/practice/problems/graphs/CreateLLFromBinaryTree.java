package practice.problems.graphs;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by kartik on 09/09/17.
 */
public class CreateLLFromBinaryTree {

    public static void main(String[] args) {

        TreeNode tree = new TreeNode(4);
        tree.left = new TreeNode(2);
        tree.right = new TreeNode(6);
        tree.left.left = new TreeNode(1);
        tree.left.right = new TreeNode(3);
        tree.right.left = new TreeNode(5);
        tree.right.right = new TreeNode(7);

        ArrayList<LinkedList<TreeNode>> list1 = getListsRecursive(tree);

        ArrayList<LinkedList<TreeNode>> list2 = getListsIterative(tree);

        System.out.println(list1.equals(list2));


    }
    static ArrayList<LinkedList<TreeNode>> getListsRecursive(TreeNode root){
        ArrayList<LinkedList<TreeNode>> lists = new ArrayList<LinkedList<TreeNode>>();
        createLists(root, lists, 0);
        return lists;
    }

    static void createLists(TreeNode root, ArrayList<LinkedList<TreeNode>> lists, int level){

        if(root == null)
            return;

        LinkedList<TreeNode> list = null;
        if(lists.size() == level){
            list = new LinkedList<TreeNode>();
            lists.add(list);
        }
        else{
            list = lists.get(level);
        }
        list.add(root);

        createLists(root.left, lists, level+1);
        createLists(root.right, lists, level+1);

    }

    static ArrayList<LinkedList<TreeNode>> getListsIterative(TreeNode root){

        ArrayList<LinkedList<TreeNode>> result = new ArrayList<LinkedList<TreeNode>>();
        LinkedList<TreeNode> current = new LinkedList<TreeNode>();

        if(root != null){
            current.add(root);
        }

        while(current.size() > 0){
            result.add(current);
            LinkedList<TreeNode> parents = current;
            current = new LinkedList<TreeNode>();

            for(TreeNode parent : parents){
                if(parent.left != null)
                    current.add(parent.left);
                if(parent.right != null)
                    current.add((parent.right));
            }

        }

        return result;
    }

}
