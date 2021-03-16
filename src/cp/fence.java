package cp;

import java.util.Scanner;

public class fence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-->0){
            System.out.println(scanner.nextLong() +scanner.nextLong()+ scanner.nextLong()-1);
        }
        scanner.close();
    }
}
