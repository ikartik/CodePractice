package practice.interview.problems.inmobi;

/**
 * @author kartik sharma
 * @date 06/06/18
 */
public class RobotGettingDestroyed {

    /*
    An island is represented in an 2d array of size mxn.
    If robot moves out of island it gets destroyed and robot is allowed to move top, down, left, right.
    Given a robot position (x, y) and k steps,
    what is the probability of robot getting survived in the effort of making k steps.
    */

    static int m[][] = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
    };

    static int s_x = 1;
    static int s_y = 1;
    static int steps = 2;
    static int safe, unsafe;

    public static void main(String[] args) {

        int r = m.length;
        int c = m[0].length;

        findOut(r, c, s_x-1, s_y,0);
        findOut(r, c, s_x+1, s_y,0);
        findOut(r, c, s_x, s_y-1,0);
        findOut(r, c, s_x, s_y+1,0);

        System.out.println("safe : "+ safe + ", unsafe : " + unsafe);
        System.out.println("Odds of getting destroyed : " + (float)unsafe/(safe+unsafe));

    }

    static void findOut(int r, int c, int x, int y, int current){
        if(current == steps)
            return;
        if(x >= r || x < 0 || y >= c || y < 0)
            unsafe += 1;
        else
            safe += 1;
        findOut(r, c, x-1, y, current+1);
        findOut(r, c, x+1, y, current+1);
        findOut(r, c, x, y-1, current+1);
        findOut(r, c, x, y+1, current+1);

    }
}
