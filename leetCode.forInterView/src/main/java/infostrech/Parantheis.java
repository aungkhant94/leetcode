package infostrech;

import java.util.Stack;

public class Parantheis {

    public static boolean isValid(String s){
        Stack<Character> stack = new Stack<Character>();
        for(int i = 0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c == '(' || c == '[' || c == '{'){
                stack.push(c);
            }
            else{
                if(stack.size() > 0){
                    char out = stack.pop();
                    if( c == ')'){
                        if(out !='('){
                            return false;
                        }
                    }
                    else if( c == '}'){
                        if(out !='{'){
                            return false;
                        }
                    }
                    else if( c == ']'){
                        if(out !='['){
                            return false;
                        }
                    }
                }
                else{
                    return false;
                }
            }
        }
        if(stack.size() == 0){
            return true;
        }
        return false;

    }
    public static void main(String[] args) {

    }
}
