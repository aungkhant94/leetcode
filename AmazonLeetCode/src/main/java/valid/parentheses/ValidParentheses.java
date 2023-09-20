package valid.parentheses;

import java.util.Stack;

//https://leetcode.com/problems/valid-parentheses/description/
public class ValidParentheses {

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        boolean isValid = true;
        for(char c:s.toCharArray()){
            System.out.println(c);
            if (stack.isEmpty() && (c==')' || c=='}' || c==']')) {
                isValid = false;
                break;
            }

            if(c=='{')
                stack.push('}');
            else if(c=='(')
                stack.push(')');
            else if(c=='[')
                stack.push(']');
            else if(stack.pop() != c ) {
                isValid = false;
            }


        }
        if (!stack.isEmpty())
            isValid = false;
        return isValid;
    }

    public static void main(String[] args) {
        String str = "(){}[]}";
        ValidParentheses vp = new ValidParentheses();
        System.out.println(vp.isValid(str));


    }
}
