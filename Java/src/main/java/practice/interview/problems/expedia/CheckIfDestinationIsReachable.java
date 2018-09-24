package practice.interview.problems.expedia;

/**
 * @author kartik sharma
 * @date 20/04/18
 */
public class CheckIfDestinationIsReachable {

    // Check if a destination is reachable from source with two movements allowed
    //  (x, x + y) and (x + y, y)

    /*
        Input : (x1, y1) = (2, 10)
        (x2, y2) = (26, 12)
        Output : True
        (2, 10)->(2, 12)->(14, 12)->(26, 12)
        is a valid path.

        Input : (x1, y1) = (20, 10)
                (x2, y2) = (6, 12)
        Output : False
        No such path is possible because x1 > x2
        and coordinates are positive
    */

    public static void main(String[] args) {
        int x1 = 20, y1 = 10;
        int x2 = 6, y2 = 12;

        System.out.println(check(x1, y1, x2, y2));
    }

    static boolean check(int x1, int y1, int x2, int y2) {
        if (x1 > x2 || y1 > y2)
            return false;

        if (x1 == x2 && y1 == y2)
            return true;

        return check(x1, x1 + y1, x2, y2) || check(x1 + y1, y1, x2, y2);
    }

}
