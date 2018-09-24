package practice.problems.misc;

/**
 * Created by kartik on 13/09/17.
 */
public class MinJumps {

    public static void main(String[] args) {
        int heights[] = {21};
        int X = 11;
        int Y = 1;

        showThem(heights, heights.length, X, Y);

    }

    static void showThem(int[] heights, int n, int x, int y){

        int jumps = 0;
        for(int i=0; i<n; i++){
            jumps ++;

            if(heights[i] > x) {
                int h = heights[i] - (x - y);
                jumps += h/(x-y);

                if (h%(x-y) > 1)
                    jumps ++;
            }
        }
        System.out.println(jumps);

    }

}
