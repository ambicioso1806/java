
// palindrome number

import java.util.*;
public class palindrome {
    public static void main(String[] args) {
        int r,temp,sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        temp=n;
        while(n>0) {
            r = n % 10;
            sum = sum * 10 + r;
             n= n / 10;
        }
        if (sum==temp)
            System.out.println("palindrome number");
        else
            System.out.println("not a palindrome number");

    }
}
