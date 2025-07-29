
// armstrong number

import java.util.*;
public class armstrong {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int flag,num=0,r;
        System.out.println("enter a number");
        int n = sc.nextInt();
        flag =n;
        while (n>0)
        {
            r=n%10;
            num=num+r*r*r;
            n=n/10;
        }
        if (flag==num)
        {
            System.out.println("armstrong number");
        }
        else
        {
            System.out.println("not an armstrong number");
        }
    }
}
