package practice.problems.misc;

/**
 * @author kartik sharma
 * @date 09/10/18
 */
public class ValidBracketCombinations {

    static int count = 0;

    public static void main(String[] args) {

        int n = 4;

        findOut(n);
        System.out.println("Total combinations : " + count);

    }

    static void findOut(int n) {

        StringBuffer sb = new StringBuffer();

        findOut(n, sb, 0, 0);
    }


    static void findOut(int n, StringBuffer s, int open, int close) {

        if (close == n) {
            System.out.println(s);
            count += 1;
            return;
        }
        if (open > close) {
            StringBuffer sb = new StringBuffer();
            sb.append(s);
            sb.append('}');
            findOut(n, sb, open, close + 1);
        }
        if (open < n) {
            StringBuffer sb = new StringBuffer();
            sb.append(s);
            sb.append('{');
            findOut(n, sb, open + 1, close);
        }

    }

}
