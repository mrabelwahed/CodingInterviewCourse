package array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SingleNumber {
    public static void main(String[] args) {
        int nums[] ={10,7,9,10,9};
        System.out.println("the number: "+singleNumber3(nums));
    }

   static  public int singleNumber(int[] nums) {
        List unique = new ArrayList<Integer>();
       for (int i = 0; i < nums.length; i++) {
           if (unique.contains(nums[i]))
               unique.remove(new Integer(nums[i]));
           else
               unique.add(nums[i]);
       }
        return (int)unique.get(0);
    }

    static  public int singleNumber2(int[] nums) {
        HashMap<Integer , Integer> map = new HashMap<>();
        for (int i = 0; i <nums.length ; i++)
            map.put(nums[i],map.getOrDefault(nums[i],0) +1);

        for (int i:map.keySet())
            if (map.get(i) == 1)
                return i;
        return  -1;
    }

    static  public int singleNumber3(int[] nums) {
       int x = 0;
        for (int i = 0; i < nums.length ; i++) {
            x^=nums[i];
        }
        return   x;
    }
}
