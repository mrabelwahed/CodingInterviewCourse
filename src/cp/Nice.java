package cp;

import java.util.Scanner;

public class Nice {
    static int ops = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();


        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int a[][] = new int[n][m];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    a[i][j] = sc.nextInt();
                }
            }

            for (int i = 0; i < n; i++) {
                int row[] = a[i];
                check(row);
            }
            System.out.println(ops );
        }


        sc.close();
    }

    static void check(int[] row) {
        int i = 0;
        int j = row.length - 1;
        while (i < j) {
            if (row[i++] != row[j--])
                ops++;
        }
    }
}
