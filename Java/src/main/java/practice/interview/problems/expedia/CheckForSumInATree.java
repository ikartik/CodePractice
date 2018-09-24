package practice.interview.problems.expedia;

/**
 * @author kartik sharma
 * @date 22/04/18
 */
public class CheckForSumInATree {

    static class Tree{
        int data;
        Tree left;
        Tree right;
        Tree(int data){
            this.data = data;
        }
    }

    public static void main(String[] args) {

        Tree tree = new Tree(1);
        tree.left = new Tree(3);
        tree.left.left = new Tree(7);
        tree.right = new Tree(10);
        tree.right.left = new Tree(-3);
        tree.right.right = new Tree(2);

        /*
                    1
                  /   \
                 3    10
                /    /  \
               7   -3    2
        */

        int sum = 10;

        System.out.println(findOut(tree, 0, sum));

    }

    static boolean findOut(Tree root, int curSum, int sum){
        if(root == null)
            return false;
        curSum += root.data;
        if(curSum == sum)
            return true;
        return (findOut(root.left, curSum, sum) || findOut(root.right, curSum, sum));
    }

}
