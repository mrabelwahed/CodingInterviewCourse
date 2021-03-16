package array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int [] a = {1,2,3};
        System.out.println("state:"+containsDuplicate2(a));
    }

    static  boolean containsDuplicate(int []a){
        Arrays.sort(a);
        for (int i = 0; i <a.length-1 ; i++) {
            if (a[i] == a[i+1]) return true;
        }
        return false;
    }

    static  boolean containsDuplicate2(int []a){
       Set set = new HashSet<Integer>();
        for (int i = 0; i <a.length ; i++) {
            set.add(a[i]);
        }
        return !(a.length == set.size());
    }
}
