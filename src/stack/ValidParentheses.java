package stack;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
     String s = "()[]{}";
     Solution solution = new Solution();
        System.out.println(solution.isValid(s));
    }


}

class Solution {
    public boolean isValid(String s) {
        int len = s.length();
        if(len == 0) return false;
        Stack<Character> stack = new Stack<Character>();
        for(int i=0;i<len;i++){
            char ch = s.charAt(i);
            if(ch == '(' || ch == '{' || ch == '[' )
                stack.push(ch);
            else if( ch ==')' && stack.peek() == '(' ||
                    ch == ']' && stack.peek() == '[' ||
                    ch == '}' && stack.peek() == '{')
                stack.pop();
            else
                return false;

        }
        return stack.isEmpty();
    }
}