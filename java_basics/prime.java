
// prime number

import java.util.*;
public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m=0,flag=0;
        System.out.println("enter a number");
        int a = sc.nextInt();
        m=a/2;
        if(a==0|| a==0) {
            System.out.println(a + "not a prime number");
        }
        else {
            for (int i = 2; i <= m; i++)
                if (a % i == 0) {
                    System.out.println(a + "not a prime number");
                    flag = 1;
                    break;
                }
        }
        if(flag == 0)
        {
            System.out.println(a+"prime number");

        }


    }
}
