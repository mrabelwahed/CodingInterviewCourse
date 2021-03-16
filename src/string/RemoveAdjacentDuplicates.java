package string;

import javax.crypto.spec.PSource;
import java.util.Stack;

public class RemoveAdjacentDuplicates {


    public static void main(String[] args) {
        Solution s =  new Solution();
        System.out.println(s.removeDuplicates("abbaca"));
    }

}


class Solution {
    public String removeDuplicates(String s) {
        int len = s.length();
        Stack<Character> stack = new Stack();
        for(int i =0;i<len;i++){
            if(stack.isEmpty())
                stack.push(s.charAt(i));
            else{
                if(stack.peek() ==  s.charAt(i))
                    stack.pop();
                else
                    stack.push(s.charAt(i));
            }

        }
        String res = "";
        if(stack.isEmpty())
            return res;
        else
        {
            StringBuilder sb = new StringBuilder();
            while(!stack.isEmpty()){
                sb.append(stack.peek());
                stack.pop();
            }
            sb = sb.reverse();
            res = sb.toString();
        }

        return res;
    }
}