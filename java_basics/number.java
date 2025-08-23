
// Java program that takes three numbers, first reverses each number, and then finds the largest among them.

import java.util.Scanner;

public class LargestReversedNumber {
    
    // Function to reverse a number
    public static int reverse(int num) {
        int rev = 0;
        while (num > 0) {
            rev = rev * 10 + num % 10;
            num /= 10;
        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input three numbers
        System.out.print("Enter first 3-digit number: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter second 3-digit number: ");
        int num2 = scanner.nextInt();
        
        System.out.print("Enter third 3-digit number: ");
        int num3 = scanner.nextInt();

        // Reverse them
        int rev1 = reverse(num1);
        int rev2 = reverse(num2);
        int rev3 = reverse(num3);

        // Print reversed numbers
        System.out.println("Reversed numbers are: " + rev1 + ", " + rev2 + ", " + rev3);

        // Find the largest
        int largest = rev1;
        if (rev2 > largest) largest = rev2;
        if (rev3 > largest) largest = rev3;

        // Print largest reversed number
        System.out.println("The largest reversed number is: " + largest);

        scanner.close();
    }
}
