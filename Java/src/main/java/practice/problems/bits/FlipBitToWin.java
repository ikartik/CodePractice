package practice.problems.bits;

/**
 * Created by kartik on 12/09/17.
 */
public class FlipBitToWin {

    public static void main(String[] args) {

        System.out.println(filpBitTo0("11011101111"));


    }

    static String filpBitTo0(String n){
        String temp[] = n.split("0");

        int max = 0;

        for(int i = 0; i < temp.length-1; i++){
            int l = temp[i].length() + temp[i+1].length() + 1;
            max = max>l?max:l;
        }
        return String.valueOf(max);
    }


}
