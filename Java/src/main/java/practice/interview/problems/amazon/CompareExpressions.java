package practice.interview.problems.amazon;

import java.util.Stack;

public class CompareExpressions {

    public static void main(String[] args) {

        String exp1 = "a-b-(c-d)";
        String exp2 = "a-b-c-d";

        compare(exp1, exp2);

    }

    static void compare(String ex1, String ex2){

        char e1[] = ex1.toCharArray();
        char e2[] = ex2.toCharArray();

        Stack<Character> stack = new Stack<Character>();

        boolean flag = false;

        for (char c : e1){

            if(c == '(' && !stack.isEmpty() && stack.peek() == '-'){
                flag = true;
                continue;
            }
            if(flag == false){
                stack.push(c);
            }
            else{
                if(c == '-')
                    stack.push('+');
                else if(c == '+')
                    stack.push('-');
                else if(c == ')')
                    flag = false;
                else
                    stack.push(c);
            }
        }

        while(!stack.isEmpty()){
            System.out.print(stack.pop());
        }
        System.out.println("");

        for (char c : e2){

            if(c == '(' && !stack.isEmpty() && stack.peek() == '-')
                flag = true;

            if(flag == false){
                stack.push(c);
            }
            else{
                if(c == '-')
                    stack.push('+');
                else if(c == '-')
                    stack.push('-');
                else if(c == ')')
                    flag = false;
                else
                    stack.push(c);
            }
        }
        while(!stack.isEmpty()){
            System.out.print(stack.pop());
        }

    }

}
