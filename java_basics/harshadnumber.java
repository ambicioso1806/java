
// harshad number

import java.util.Scanner;

public class HarshadNumber {

    public static boolean isHarshadNumber(int num) {
        // Handle negative numbers by taking absolute value
        int originalNum = Math.abs(num);
        if (originalNum == 0) {
            return false; // 0 is not considered a Harshad number
        }

        // Calculate the sum of digits
        int digitSum = 0;
        int temp = originalNum;
        while (temp > 0) {
            digitSum += temp % 10;
            temp /= 10;
        }

        // Check if the number is divisible by the sum of its digits
        return originalNum % digitSum == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check if it's a Harshad number: ");
        int number = scanner.nextInt();

        if (isHarshadNumber(number)) {
            System.out.println(number + " is a Harshad number");
        } else {
            System.out.println(number + " is not a Harshad number");
        }

        scanner.close();
    }
}
