
// Java Program to Find Smallest of Three Numbers Using Ternary Operator

import java.util.Scanner;

public class ternary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter three numbers:");
        System.out.print("First number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Third number: ");
        double num3 = scanner.nextDouble();

        // Using nested ternary operator to find smallest
        double smallest = (num1 <= num2) ?
                ((num1 <= num3) ? num1 : num3) :
                ((num2 <= num3) ? num2 : num3);

        System.out.println("The smallest number is: " + smallest);

        scanner.close();
    }
}
