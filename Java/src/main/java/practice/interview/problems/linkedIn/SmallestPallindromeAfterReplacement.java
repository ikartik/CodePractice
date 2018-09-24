package practice.interview.problems.linkedIn;

/**
 * @author kartik sharma
 * @date 20/05/18
 */
public class SmallestPallindromeAfterReplacement {


    /*

    Given a string which has some lowercase alphabet characters and one special character dot(.).
    We need to replace all dots with some alphabet character in such a way that resultant string becomes a palindrome
    In case of many possible replacements, we need to choose palindrome string which is lexicographically smallest.
    If it is not possible to convert string into palindrome after all possible replacements then output Not possible.

    Examples:

    Input : str = “ab..e.c.a”
    Output : abcaeacba
    The smallest palindrome which can be made
    after replacement is "abcaeacba"
    We replaced first dot with "c", second dot with
    "a", third dot with "a" and fourth dot with "b"

    Input  : str = “ab..e.c.b”
    Output : Not Possible
    It is not possible to convert above string into
    palindrome


    */


    public static void main(String[] args) {

        String str = "ab..e.c.a";
        int l = str.length();

        char[] s = str.toCharArray();
        boolean flag = true;

        for (int i = 0, j = l - 1; i < j; i++, j--) {

            while(i < j && s[i] == s[j] && s[i] != '.'){
                i++;
                j--;
            }
            if(s[i] == '.' && s[j] == '.')
                s[i] = s[j] = 'a';
            else if(s[i] == '.')
                s[i] = s[j];
            else if(s[j] == '.')
                s[j] = s[i];
            else{
                flag = false;
                break;
            }

        }

        if(flag)
            System.out.println(s);
        else
            System.out.println("Na ho pai");

    }

}
