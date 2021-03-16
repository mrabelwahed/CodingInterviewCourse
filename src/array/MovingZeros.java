package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MovingZeros {
    public static void main(String[] args) {
        int a [] ={0,4,0,9,};
        System.out.println(Arrays.toString(movingZeros2(a)));
    }

    private static int[] movingZeros(int[] a) {
     List list = new ArrayList(); //0(n)

     int zcount =0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0)
                zcount++;
            else
                list.add(a[i]);
        }

        for (int i = 0; i < zcount; i++) {
            list.add(0);
        }

        for (int i = 0; i < list.size(); i++) {
            a[i] = (int)list.get(i);
        }
        return  a;
    }

    private static int[] movingZeros2(int[] a) {
        int slow = 0;
        for(int fast =0; fast<a.length;fast++)
            if (a[fast]!=0){
                swap(a,fast,slow);
                slow++;
            }

        return  a;
    }

    static  void swap(int a[] , int fast, int slow){
        int tmp = a[fast];
        a[fast] = a[slow];
        a[slow] = tmp;
    }

}
