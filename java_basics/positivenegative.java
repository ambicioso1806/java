
//if a Number is Positive or Negative

import java.util.*;
public class positivenegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        if(n>0)
        {
            System.out.println("positive number");
        }
        else
        {
            System.out.println("negative number");
        }
    }
}
