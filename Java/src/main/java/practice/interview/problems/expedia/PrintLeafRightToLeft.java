package practice.interview.problems.expedia;

import org.junit.Test;

/**
 * @author kartik sharma
 * @date 24/09/18
 */
public class PrintLeafRightToLeft {

    class Tree{
        private int data;
        private Tree left;
        private Tree right;
        public Tree(int data){
            this.data = data;
            this.left = this.right = null;
        }
    }

    @Test
    public void testMethod(){

        /*
                    1
                   / \
                  2   4
                 /   / \
                3   5   6
                     \
                     7

              Output : 6 7 3
        */

        Tree tree = new Tree(1);
        tree.left = new Tree(2);
        tree.left.left = new Tree(3);
        tree.right = new Tree(4);
        tree.right.left = new Tree(5);
        tree.right.right = new Tree(6);
        tree.right.left.right = new Tree(7);

        printLeaf(tree);
    }

    public void printLeaf(Tree tree){

        if(tree == null)
            return;
        if(tree.left == null && tree.right == null)
            System.out.print(tree.data + " ");
        printLeaf(tree.right);
        printLeaf(tree.left);

    }

}
