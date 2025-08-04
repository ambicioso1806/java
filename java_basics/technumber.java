
// tech number

import java.util.*;
public class technumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int digit = 0;
        System.out.println("enter a number ");
        int n = sc.nextInt();
        int num = n;
        while ( num >0)
        {
            digit++;
            num=num/10;
        }
        if (digit % 2 == 0)
        {
            num=n;
            int div = (int)Math.pow(10,digit/2);
            int firsthalf = num/div;
            int secondhalf = num%div;
            int sum = firsthalf + secondhalf;
            if ((sum*sum) == n)
                System.out.println("tech number");
            else
                System.out.println("not an tech number");
        }
        else
            System.out.println("not an tech number");
    }
}
