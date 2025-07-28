
// factorial of a number

import java.util.*;
public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fact =1;
        System.out.println("enter a number");
        int s = sc.nextInt();
        for(int i=1; i<=s;i++)
             fact=fact*i;
        System.out.println(fact);

    }
}
