
// SUM OF THE DIGITS

import java.util.*;
public class sumofdigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.println("enter a number");
        int n = sc.nextInt();
        while(n>0) {
            int d = n % 10;
            sum = sum + d;
            n=n/10;

        }
        System.out.println(sum);
    }
}
