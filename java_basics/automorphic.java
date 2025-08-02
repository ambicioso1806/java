
// AUTOMORPHIC NUMBER

import java.util.*;
public class automorphic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        int sq = n*n;
        while (n>0)
        {
            if(n%10==sq%10) {
                System.out.println("automorphic number");
            }
            else {
                System.out.println("not automorphic number");
            }
            n=n/10;
            sq=sq/10;


        }
    }
}
