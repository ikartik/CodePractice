package practice.problems.tree;

import org.junit.Test;

/**
 * @author kartik sharma
 * @date 24/05/18
 */
public class BTreeTraversal {

    class Tree{
        int data;
        Tree left;
        Tree right;
        Tree(int d){
            this.data = d;
            this.left = this.right = null;
        }
    }

    @Test
    public void testMethod(){


        //          1
        //        /   \
        //       2    3
        //     / \   / \
        //    4  5   6  7


        Tree tree = new Tree(1);
        tree.left = new Tree(2);
        tree.right = new Tree(3);
        tree.left.left = new Tree(4);
        tree.left.right = new Tree(5);
        tree.right.left = new Tree(6);
        tree.right.right = new Tree(7);

        System.out.println("preOrder");
        preOrder(tree);
        System.out.println("\ninOrder");
        inOrder(tree);
        System.out.println("\npostOrder");
        postOrder(tree);

    }

    void preOrder(Tree root){
        if(root == null)
            return;
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    void inOrder(Tree root){
        if(root == null)
            return;
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    void postOrder(Tree root){
        if(root == null)
            return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }

}