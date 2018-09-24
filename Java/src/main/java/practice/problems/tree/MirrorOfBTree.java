package practice.problems.tree;

import org.junit.Test;

import java.util.LinkedList;

/**
 * @author kartik sharma
 * @date 20/09/18
 */
public class MirrorOfBTree {


    class Node {
        private int data;
        private Node left;
        private Node right;

        public Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }

    }


    @Test
    public void testMethod() {

                    /*

                    1                    1
                   / \                  / \
                  2   4   ------>      4   2
                 /   / \              / \   \
                3   5   6            6   5   3

                     */


        Node tree = new Node(1);
        tree.left = new Node(2);
        tree.left.left = new Node(3);
        tree.right = new Node(4);
        tree.right.left = new Node(5);
        tree.right.right = new Node(6);


        printPreorderTree(tree);
        System.out.println("");


        Node mirror = modify(tree);


        printPreorderTree(mirror);
        System.out.println("");


    }

    public Node modify(Node tree){

       if(tree == null)
           return null;
        Node left = modify(tree.left);
        Node right = modify(tree.right);

        tree.left = right;
        tree.right = left;

        return tree;
    }


    public void printPreorderTree(Node tree){

        if(tree == null)
            return;
        System.out.print(tree.data + " ");
        printPreorderTree(tree.left);
        printPreorderTree(tree.right);

    }

    public void printRevPreorderTree(Node tree){

        if(tree == null)
            return;
        System.out.print(tree.data + " ");
        printRevPreorderTree(tree.right);
        printRevPreorderTree(tree.left);

    }

}
