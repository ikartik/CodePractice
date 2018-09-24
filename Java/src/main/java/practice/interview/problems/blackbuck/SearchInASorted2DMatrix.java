package practice.interview.problems.blackbuck;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author kartik sharma
 * @date 30/04/18
 */
public class SearchInASorted2DMatrix {

    /*

    Given an n x n matrix and a number x, find position of x in the matrix if it is present in it.
    Else print “Not Found”. In the given matrix, every row and column is sorted in increasing order.
    The designed algorithm should have linear time complexity.


    Input :
            mat[4][4] = { {10, 20, 30, 40},
                        {15, 25, 35, 45},
                        {27, 29, 37, 48},
                        {32, 33, 39, 50}};
            x = 29
    Output :
            Found at (2, 1)

    Input :
            mat[4][4] = { {10, 20, 30, 40},
                        {15, 25, 35, 45},
                        {27, 29, 37, 48},
                        {32, 33, 39, 50}};
            x = 100
    Output :
            Element not found

    */

    public static void main(String[] args) {
        
        int mat[][] = {{10, 20, 30, 40},
                        {15, 25, 35, 45},
                        {27, 29, 37, 48},
                        {32, 33, 39, 50},
                        {35, 36, 41, 51}};
        int x = 41;
        int R = 5;
        int C = 4;

        findElement(mat, x, R, C);
    }

    public static void findElement(int m[][], int x, int R, int C){

        int i = 0, j = C-1;
        boolean flag = false;

        while(i < R && j >= 0){

            if(m[i][j] == x) {
                System.out.println("Found at index (" + i + ", " + j + ")");
                flag = true;
                break;
            }
            if(m[i][j] > x){
                j--;
            } else {
                i += 1;
            }
        }
        if(!flag)
            System.out.println("Not found.");

    }



}
