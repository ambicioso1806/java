
//  Check if a Given Number is Perfect Square

import java.util.*;
public class perfectnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int s = sc.nextInt();
        double sqrt = Math.sqrt(s);
        double n = Math.floor(sqrt);
        if (sqrt-n == 0)
        {
            System.out.println("The given number is perfect square ");
        }
        else
        {
            System.out.println("The given number is  not  a perfect square  ");
        }

    }
}
