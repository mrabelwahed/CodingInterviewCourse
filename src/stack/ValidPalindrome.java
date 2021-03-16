package stack;

import java.util.Stack;

public class ValidPalindrome {
    public static void main(String[] args) {
        Solution2 solution2 = new Solution2();
        System.out.println(solution2.isPalindrome("A man, a plan, a canal: Panama"));
    }
}

class Solution2 {
    public boolean isPalindrome(String s) {
        if(s.length() == 0) return false;
        s = s.replaceAll("[^a-zA-Z0-9_]","").toLowerCase();
        Stack<Character> stack = new Stack();
        for(int i=0;i<s.length();i++)
            stack.push(s.charAt(i));
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()){
            char ch =  stack.peek();
            sb.append(ch);
            stack.pop();
        }
        String ret =  sb.toString();
        return ret.equals(s);
    }
}
