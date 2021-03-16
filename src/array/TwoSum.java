package array;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int a [] = {4,3,5,9};
        System.out.println(Arrays.toString(twoSum2(a,9)));
    }

    private static int[] twoSum(int[] a, int target) {
        for (int i = 0; i <a.length ; i++) {
            for (int j = i+1; j < a.length; j++) {
                if(a[j] == target-a[i])
                    return  new int[]{i,j};
            }
        }
        throw  new IllegalArgumentException("no available numbers");
    }

    private static int[] twoSum2(int[] a, int target) {
        HashMap map = new HashMap<Integer, Integer>();
        for (int i = 0; i <a.length ; i++) {
            int comp = target-a[i];

            if(!map.containsKey(comp))
                map.put(a[i],i);
            else
                return new int[]{i,(int)map.get(comp)};
            }
        throw new IllegalArgumentException("no available numbers");
        }

}
