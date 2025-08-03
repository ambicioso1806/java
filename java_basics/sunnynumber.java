
// sunny number

import java.util.*;
public class sunnynumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        int s = n + 1;
        double sq = Math.sqrt(s);

        if (sq == (int)sq)
        {
            System.out.println("sunny number");
        }
        else
        {
            System.out.println(("not a sunny number"));
        }

    }
}
