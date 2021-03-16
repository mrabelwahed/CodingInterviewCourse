package sort;

import java.util.Arrays;
import java.util.Collections;

public class BasyDays {
  private static final String DATA = "[\n" +
          "{\"check-in\" : 1, \"check-out\" : 4},\n" +
          "{\"check-in\" : 2, \"check-out\" : 5},\n" +
          "{\"check-in\" : 10, check-out  : 12},\n" +
          "{\"check-in\" : 5, \"check-out\" : 9},\n" +
          "{\"check-in\" : 5, \"check-out\" : 12}\n" +
          "]";
    public static void main(String[] args) {
        int A[] = {1,2,5,5};
        int D[] = {4,12,9,12};
        System.out.println(solve(A,D));
    }




    static  private int solve(int []A , int [] D){
        Arrays.sort(A); //[1,2,5,5,10]     2
        Arrays.sort(D); //[4,9,12,12]

        int guestCount = 1;
        int i=1,j=0;
        int len = A.length;
        int max = 0;
        int day = A[i];

        while(i<len && j<len){
            if(A[i] <= D[j]) // 5<=4
            {
                guestCount++; //3

                if(max<guestCount){
                    max = guestCount; //max = 2
                    day =  A[i++];     // day = 2
                }

            }else{
                guestCount--; // 1
                j++;//1
            }
        }
        return day;
    }
}
