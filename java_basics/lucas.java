
// write a program in java to print the lucas number

import java.util.Scanner;
public class LucasNumber {
    public static int lucas(int n) {
        if (n == 0)
            return 2;
        if (n == 1)
            return 1;
        return lucas(n - 1) + lucas(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        int result = lucas(n);
        System.out.println("Lucas number at position " + n + ": " + result);

        sc.close();
    }
}
