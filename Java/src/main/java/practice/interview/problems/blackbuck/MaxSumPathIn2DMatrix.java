package practice.interview.problems.blackbuck;

import java.util.Arrays;

/**
 * @author kartik sharma
 * @date 15/05/18
 */
public class MaxSumPathIn2DMatrix {


    public static void main(String[] args) {
        int mat[][] = {
                {8, 7, 1, 4},
                {9, 4, 6, 3},
                {1, 2, 3, 8},
                {91, 3, 55, 11},
                {14, 15, 17, 9}
        };
        int m = 5, n = 4;

//        System.out.println(collectMaximumNoOfPoints(mat, m, n));
        int ans[][] = collectMaximumNoOfPoints(mat, m, n);
        for (int[] row : ans) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println("");
        }
    }

    static int[][] collectMaximumNoOfPoints(int[][] matrix, int m, int n) {

        int aux[][] = new int[m][n];

        int j_max = 2;

        aux[0][0] = matrix[0][0];

        for (int i = 1; i < m; i++) {
            for (int j = 0; j < n; j++) {

                int a = 0, b = 0, c = 0;


                if (i - 1 >= 0 && j - 1 >= 0 && j - 1 < j_max) {
                    a = aux[i - 1][j - 1];
                }
                if (i - 1 >= 0 && j < j_max) {
                    b = aux[i - 1][j];
                }
                if (i - 1 >= 0 && j + 1 < n && j + 1 < j_max) {
                    c = aux[i - 1][j + 1];
                }

                aux[i][j] = max(a, max(b, c)) + matrix[i][j];

            }
            j_max += 1;
        }
        System.out.println(aux[m - 1][0] + "\n\n");
        return aux;
    }

    static int max(int x, int y) {
        return x > y ? x : y;
    }

}
