package cp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        List<Integer> list = new ArrayList<Integer>();
        while (t-- > 0) {
            list.add(scanner.nextInt());
        }
        int max = 0;
        int max_i = 0;
        int length = list.size();
        while (length-- > 0){
            for (int j = 0; j < list.size() - 1; j++) {
                int sum = list.get(j) + list.get(j+1);
                max = Math.max(max, sum);
                //if (sum > max)
                    max_i = j;
            }

            list.set(max_i , -1 * (list.get(max_i) + list.get(max_i+1)));

            list.remove(max_i+1);
        }
        System.out.println(list.get(max_i));

        scanner.close();
    }
}
