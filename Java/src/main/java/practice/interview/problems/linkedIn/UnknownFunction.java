package practice.interview.problems.linkedIn;

/**
 * @author kartik sharma
 * @date 24/05/18
 */
public class UnknownFunction {


    public static void main(String[] args) {

        int n = 16;
        System.out.println(unknownFunction(n));

    }

    static int unknownFunction(int c){
        int a = 0;

        while((c>>=1) != 0) {
            a++;
        }
        return a;
    }

}