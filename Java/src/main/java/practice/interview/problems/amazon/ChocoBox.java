package practice.interview.problems.amazon;

import java.util.*;

/**
 * Created by kartik on 20/07/17.
 */
public class ChocoBox {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String input = sc.nextLine();
        ArrayList<String> cs = new ArrayList<String>();

        cs.addAll(Arrays.asList(input.split(" ")));

        ArrayList<Integer> chcocoBox = new ArrayList<Integer>();
        int item = 0;
        for(int i=0; i<cs.size(); i++){
            item = item + Integer.parseInt(cs.get(i));
            chcocoBox.add(item);
        }
        int q = sc.nextInt();
        for(int j=0; j<q; j++){
            int index = sc.nextInt();
            for(int k=0; k<chcocoBox.size(); k++){
                if(chcocoBox.get(k)>=index){
                    System.out.println(k+1);
                    break;
                }
            }
        }
    }

}
