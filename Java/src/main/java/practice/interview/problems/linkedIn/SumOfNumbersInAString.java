package practice.interview.problems.linkedIn;

import org.junit.Test;

/**
 * @author kartik sharma
 * @date 21/05/18
 */
public class SumOfNumbersInAString {

    @Test
    public void findOut() {

        String str = "12a1c20yz68";
        int sum = 0;

        StringBuffer temp = new StringBuffer();

        for (int i = 0; i < str.length(); i++) {
            if (isDigit(str.charAt(i))) {
                temp.append(str.charAt(i));
            }
            else{
                if(temp.length() != 0)
                    sum += Integer.parseInt(temp.toString());
                temp.setLength(0);
            }
        }
        if(temp.length() != 0)
            sum += Integer.parseInt(temp.toString());

        System.out.println(sum);
    }

    boolean isDigit(char c){
        if(Character.isDigit(c))
            return true;
        return false;
    }

}
