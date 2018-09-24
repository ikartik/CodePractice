package practice.interview.problems.linkedIn;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;

/**
 * @author kartik sharma
 * @date 21/05/18
 */
public class AllPathsInA2DMatrix {

    static int paths = 0;

    static int mat[][] = {
            {1, 0, 1, 1},
            {1, 1, 0, 1},
            {0, 1, 1, 0},
            {1, 1, 1, 1}
    };

    static int r = 4;
    static int c = 4;

    public static void main(String[] args) {


        int i = 0, j = 0;

//        System.out.println(paths + ", " + i + ", " + j);

        if (isValidMove(i + 1, j))
            checkPath(i + 1, j);
        if (isValidMove(i, j + 1))
            checkPath(i, j + 1);

        System.out.println("Total Paths : " + paths);
    }

    static boolean isValidMove(int i, int j) {
        if (i < r && j < c && mat[i][j] == 1)
            return true;
        return false;
    }

    static public void checkPath(int i, int j) {
//        System.out.println(paths + ", " + i + ", " + j);
        if (i == r - 1 && j == c - 1)
            paths += 1;
        if (isValidMove(i + 1, j))
            checkPath(i + 1, j);
        if (isValidMove(i, j + 1))
            checkPath(i, j + 1);
    }

}
