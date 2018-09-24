package practice.interview.problems.expedia;

/**
 * @author kartik sharma
 * @date 22/04/18
 */
public class IsolatedIslands {

    // Given a matrix m x n, find out the total connected components in it.

    /*

    1 0 0 1 1
    1 0 1 1 0
    0 0 0 0 0
    1 1 0 0 1

    Above matrix has 4 connected components.

    */

    public static void main(String[] args) {

        int[][] m = {{1, 0, 0, 1, 1}, {1, 0, 1, 1, 0}, {0, 0, 0, 0, 0}, {1, 1, 0, 0, 1}};
        int R = 4, C = 5;
        boolean v[][] = new boolean[R][C];
        int count = 0;

        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (m[i][j] == 1 && v[i][j] == false) {
                    System.out.println(i + " , " + j);
                    v[i][j] = true;
                    check(i + 1, j, m, v, R, C);
                    check(i + 1, j + 1, m, v, R, C);
                    check(i + 1, j - 1, m, v, R, C);
                    check(i, j + 1, m, v, R, C);
                    check(i, j - 1, m, v, R, C);
                    check(i - 1, j - 1, m, v, R, C);
                    check(i - 1, j + 1, m, v, R, C);
                    check(i - 1, j, m, v, R, C);
                    count += 1;
                }
            }
        }
        System.out.println("Total connected components : " + count);
    }

    static void check(int i, int j, int[][] m, boolean[][] v, int R, int C) {
        if (i >= 0 && j >= 0 && i < R && j < C && m[i][j] == 1 && v[i][j] == false) {
            System.out.println(i + " , " + j);
            v[i][j] = true;
            check(i + 1, j, m, v, R, C);
            check(i + 1, j + 1, m, v, R, C);
            check(i + 1, j - 1, m, v, R, C);
            check(i, j + 1, m, v, R, C);
            check(i, j - 1, m, v, R, C);
            check(i - 1, j - 1, m, v, R, C);
            check(i - 1, j + 1, m, v, R, C);
            check(i - 1, j, m, v, R, C);
        }
    }

}