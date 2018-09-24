package practice.problems.misc;

/**
 * Created by kartik on 25/07/17.
 */
public class StringCompression {

    public static void main(String[] args) {

        String input = "aabcccccaaa";

        StringBuffer output = new StringBuffer();

        char lastChar = input.length()!=0?input.charAt(0):null;
        int lastCount = 0;
        for (int i=0; i<input.length(); i++){

            if(input.charAt(i)==lastChar){
                lastCount++;
                if(i==input.length()-1){
                    output.append(lastChar);
                    output.append(lastCount);
                }
            }
            else{
                output.append(lastChar);
                output.append(lastCount);
                lastChar = input.charAt(i);
                lastCount = 1;
            }
        }

        System.out.println(input);
        System.out.println(output);

        System.out.println(input.length()<output.length()?input:output);

    }
}
