package practice.problems.misc;

/**
 * Created by kartik on 20/07/17.
 */
public class URLify {

    public static void main(String[] args) {

        String input = "Mr. Kartik Sharma    ";
        int trueLength = 17;

        System.out.println(printURL(input, trueLength));

    }

    public static String printURL(String input, int trueLength){

        int index = input.length()-1;

        char[] inArray = input.toCharArray();

        for(int i=trueLength-1; i>=0; i--){

            if(input.charAt(i)==' '){
                inArray[index] = '0';
                inArray[index-1] = '2';
                inArray[index-2] = '%';
                index -= 3;
            }
            else {
                inArray[index] = input.charAt(i);
                index -= 1;
            }
        }
        return String.valueOf(inArray);
    }

}
