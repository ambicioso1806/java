
// REVERSE OF A NUMBER

import java.util.*;
public class reverse {
    public static void main(String[] args) {
        int rev =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number ");
        int n = sc.nextInt();
        while(n>0) {
            int r = n % 10;
            rev = rev * 10 + r;
            n = n / 10;
        }
        System.out.println(rev);


    }
}
