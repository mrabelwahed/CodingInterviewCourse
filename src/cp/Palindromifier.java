package cp;

import java.util.Scanner;

public class Palindromifier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if (isPalindrome(s))
            System.out.println("0");
        boolean isLeft = false;
        boolean isRight = false;
        int len = s.length();
        int i= 0;
        int j = len-1;
        char ch1 = s.charAt(i);
        char ch2 = s.charAt(j);
        while(i<j){
            if (ch1 != ch2) {
                //abac
               if(isPalindrome(s.substring(0,j)))
                   isRight = true;
               else if(isPalindrome(s.substring(1)))
                   isLeft = true;
               break;
            }
            i++;
            j--;
        }
       int index =0 ;
        while(index<len-1){
          s= s+ s.substring(0,3);
        }


        sc.close();
    }

   static boolean isPalindrome(String s){
       System.out.println("========="+ s);
        int len = s.length();
        int i= 0;
        int j = len-1;
        char ch1 = s.charAt(i);
        char ch2 = s.charAt(j);
        while(i<j){
            if (ch1 != ch2) return false;
            i++;
            j--;
        }
        return true;
    }
}
